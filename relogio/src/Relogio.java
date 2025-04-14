public sealed abstract class Relogio permits HoraBR, HoraUSA {

    protected int hora;
    protected int minuto;
    protected int segundo;

    public abstract Relogio converter(Relogio relogio);

    public String getHorario() {
        return this.setZeroEsquerda(this.hora) + ":"
                + setZeroEsquerda(this.minuto) + ":"
                + setZeroEsquerda(this.segundo);
    }

    public void setHora(int hora) {
        if (hora > 23) {
            this.hora = 0;
            return;
        }
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        if (minuto > 59) {
            this.minuto = 0;
            return;
        }
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo > 59) {
            this.segundo = 0;
            return;
        }
        this.segundo = segundo;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String setZeroEsquerda(int numero) {
        if (numero < 10) {
            return "0" + numero;
        } else {
            return "" + numero;
        }
    }
}