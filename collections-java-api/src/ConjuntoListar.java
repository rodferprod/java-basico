import conjunto.ConjuntoConvidados;

public class ConjuntoListar {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Número de convidados existente no set: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Convidado 01", 124);
        conjuntoConvidados.adicionarConvidado("Convidado 02", 453);
        conjuntoConvidados.adicionarConvidado("Convidado 03", 645);
        conjuntoConvidados.adicionarConvidado("Convidado 04", 765);
        conjuntoConvidados.adicionarConvidado("Convidado 05", 678);
        conjuntoConvidados.adicionarConvidado("Convidado 06", 543);
        conjuntoConvidados.adicionarConvidado("Convidado 07", 789);
        // Item será ignorado por já haver um convite de código 124
        conjuntoConvidados.adicionarConvidado("Convidado 08", 124);
        // Item será ignorado por já haver um convite de código 678
        conjuntoConvidados.adicionarConvidado("Convidado 09", 678);
        // Item será ignorado por já haver um convite de código 789
        conjuntoConvidados.adicionarConvidado("Convidado 10", 789);

        System.out.println("Número de convidados existente no set: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.imprimirConvidados();

        conjuntoConvidados.removerConvidadoPeloCodigo(765);

        System.out.println("Número de convidados existente no set: " + conjuntoConvidados.contarConvidados());

    }
}
