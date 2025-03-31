import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double saldo = 50.0;
        boolean comprar = true;
        System.out.println("Saldo inicial:" + saldo);
        while(comprar) {
            Double valorCompra = valorAleatorio();
            // Comprar apenas enquanto hover saldo
            if(valorCompra > saldo){
                comprar = false;
                System.out.println("Produto no valor de R$ " + valorCompra + " não cabe no saldo restante.");
            }else {
                System.out.println("Produto no valor de R$ " + valorCompra + " adicionado no carrinho.");
                saldo = saldo - valorCompra;
            }
        }
        System.out.println("Saldo atual:" + saldo);
        System.out.println("Compra finalizada!");
   }

    private static double valorAleatorio() {
        // Retorna um número aleatório entre 2 e 8
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}