public abstract class Ingresso {

    protected double valor;
    protected String filme;
    protected boolean dublado;

    public abstract double getValorTotal();

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public String getFilme() {
        return filme;
    }

    public double getValor() {
        return valor;
    }

    public boolean getDublado() {
        return this.dublado;
    }
}