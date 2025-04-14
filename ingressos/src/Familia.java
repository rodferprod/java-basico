import java.util.Scanner;

public class Familia extends Ingresso {

    private int quantidadeIngressos;
    private double desconto = 5;
    private double valorDesconto;

    public double getValorTotal() {
        if (this.quantidadeIngressos == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, informe a quantidade de ingressos desejada:");
            this.quantidadeIngressos = scanner.nextInt();
            scanner.close();
        }
        if (this.quantidadeIngressos > 3) {
            this.valorDesconto = (this.valor * this.quantidadeIngressos) * (this.desconto / 100);
            return (this.valor * this.quantidadeIngressos) - this.valorDesconto;
        } else {
            return this.valor * this.quantidadeIngressos;
        }
    }

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }
}
