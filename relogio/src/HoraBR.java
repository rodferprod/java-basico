public final class HoraBR extends Relogio {

    @Override
    public Relogio converter(Relogio relogio) {
        if (relogio instanceof HoraUSA horaUSA) {
            if (horaUSA.getIndicadorPeriodo() == "PM") {
                if (horaUSA.hora >= 1 && horaUSA.hora <= 12) {
                    this.hora = horaUSA.hora + 12;
                } else {
                    this.hora = horaUSA.hora;
                }
            } else {
                this.hora = horaUSA.hora;
            }
        }
        this.minuto = relogio.minuto;
        this.segundo = relogio.segundo;

        return this;
    }

}
