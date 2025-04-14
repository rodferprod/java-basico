public class MeiaEntrada extends Ingresso {

    private double desconto = 50;
    private double valorDesconto;

    public double getValorTotal() {
        this.valorDesconto = this.valor * (this.desconto / 100);
        return this.valor - this.valorDesconto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getValorDesconto() {
        return this.valorDesconto;
    }
}
