public class Familia extends Ingresso {

    private double desconto = 5;
    private double valorDesconto;

    @Override
    public double getValorTotal() {
        if (this.quantidadeIngressos > 3) {
            this.valorDesconto = (this.valor * this.quantidadeIngressos) * (this.desconto / 100);
            return (this.valor * this.quantidadeIngressos) - this.valorDesconto;
        } else {
            return this.valor * this.quantidadeIngressos;
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

}
