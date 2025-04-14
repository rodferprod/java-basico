public final class HoraUSA extends Relogio {

    private String indicadorPeriodo;

    public void setIndicadorPeriodo(String indicadorPeriodo) {
        this.indicadorPeriodo = indicadorPeriodo;
    }

    public String getIndicadorPeriodo() {
        return indicadorPeriodo;
    }

    @Override
    public Relogio converter(Relogio relogio) {
        if (relogio instanceof HoraBR horaBR) {
            this.indicadorPeriodo = "AM";
            if (horaBR.hora >= 12 && horaBR.hora <= 23) {
                this.indicadorPeriodo = "PM";
                if (horaBR.hora > 12)
                    this.hora = horaBR.hora - 12;
                else
                    this.hora = horaBR.hora;
            } else {
                this.hora = relogio.hora;
            }
        } else {
            this.hora = relogio.hora;
        }
        this.minuto = relogio.minuto;
        this.segundo = relogio.segundo;
        return this;
    }

    @Override
    public String getHorario() {
        return super.getHorario() + " " + this.indicadorPeriodo;
    }
}
