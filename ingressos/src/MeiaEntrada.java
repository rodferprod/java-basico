public class MeiaEntrada extends Ingresso {

    private double desconto = 50;
    private double valorDesconto;

    @Override
    public double getValorTotal() {
        this.valorDesconto = (this.quantidadeIngressos * this.valor) * (this.desconto / 100);
        this.valor = this.quantidadeIngressos * this.valor;
        return this.valor - this.valorDesconto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getValorDesconto() {
        return this.valorDesconto;
    }
}
