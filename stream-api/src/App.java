import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenando números na ordem natural
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();
        numerosOrdenados.forEach(System.out::println);

        // Somando números pares da lista
        Integer somaPares = numeros.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(somaPares);

        // Verificando se todos os números são positivos
        List<Integer> todosPositivos = numeros.stream().filter(n -> n < 0).toList();
        System.out.println(
                todosPositivos.isEmpty() ? "Todos os números são positivos." : "Nem todos os números são positivos.");

        // Removendo da lista os números ímpares
        List<Integer> apenasNumerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Exibindo os números pares da lista: " + apenasNumerosPares);

        // Exibindo a média entre os números maiores que 5 da lista
        OptionalDouble mediaMaioresQueCinco = numeros.stream().filter(n -> n > 5).mapToDouble(Integer::intValue)
                .average();
        System.out.println("A média dos números maiores que 5 é: " + mediaMaioresQueCinco.getAsDouble());

        // Verificando se algum número da lista é maior que 10
        List<Integer> maioresQueDez = numeros.stream().filter(n -> n > 10).toList();
        System.out.println(
                maioresQueDez.isEmpty() ? "Nenhum número da lista é maior que 10" : "Maiores que 10: " + maioresQueDez);

        // Exibindo o segundo maior número da lista
        List<Integer> segundoMaior = numeros.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).toList();
        System.out.println("Segundo maior da lista: " + segundoMaior.get(0));

        // Somar todos os números da lista
        Optional<Integer> somaTodos = numeros.stream().reduce((t, n) -> t + n);
        System.out.println("Soma de todos os números da lista: " + somaTodos.get());

    }
}
