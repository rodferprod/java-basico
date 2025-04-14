public class Ingresso {

    protected double valor;
    protected String filme;
    protected boolean dublado;
    protected int quantidadeIngressos = 1;

    public double getValorTotal() {
        return this.valor * this.quantidadeIngressos;
    };

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

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }
}