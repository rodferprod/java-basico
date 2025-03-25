public class Operadores {
    public static void main(String[] args) {
        int temperatura = 12;

        // - com + dá menos, convertendo o sinal para negativo
        temperatura = - temperatura;

        // - com + dá menos, então temperatura permanece negativo
        temperatura = + temperatura;

        // - com - dá mais, convertendo o sinal para positivo
        temperatura = - temperatura;

        // A melhor forma de inverter o sinal de um número
        // seja positivo ou negativo é multiplicando por -1
        temperatura = temperatura * (-1);

        // Aumenta uma unidade no valor da temperatura
        temperatura++;

        // Diminui uma unidade no valor da temperatura
        temperatura--;

        boolean temperaturaPositiva = false;

        // Nega o valor de temperaturaPositiva, convertendo para true
        temperaturaPositiva = ! temperaturaPositiva;

        // Nega o valor, convertendo para false
        temperaturaPositiva = ! temperaturaPositiva;

        // Operador relacional (>) e ternário (? :)
        temperaturaPositiva = temperatura > 0 ? true : false;

        System.out.println("A temperatura é positiva? " + temperaturaPositiva);

        String nome1 = "Rodrigo";

        String nome2 = new String("Rodrigo");

        // Retorna false
        boolean nomesIguais1 = nome1 == nome2;

        System.out.println("Os nomes são iguais? " + nomesIguais1);

        // Para comparar conteúdos usamos o método .equals()
        boolean nomesIguais2 = nome1.equals(nome2);
        
        System.out.println("Os nomes são iguais? " + nomesIguais2);
    }
}
