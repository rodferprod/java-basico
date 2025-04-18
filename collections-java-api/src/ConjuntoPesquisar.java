import conjunto.AgendaContatos;

public class ConjuntoPesquisar {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.imprimirContatos();

        agendaContatos.adicionarContato("Rodrigo", 4565468);
        agendaContatos.adicionarContato("Rafael", 5645665);
        agendaContatos.adicionarContato("Ricardo", 4798768);
        agendaContatos.adicionarContato("Rômulo", 98564874);
        agendaContatos.adicionarContato("Adriana", 54231234);
        agendaContatos.adicionarContato("Rodrigo", 87655676);
        agendaContatos.adicionarContato("Rodrigo José", 58687667);
        agendaContatos.adicionarContato("Rodrigo Guimarães", 321342334);
        agendaContatos.adicionarContato("Rodrigo Ferreira", 521314254);

        agendaContatos.imprimirContatos();

        System.out.println(agendaContatos.pesquisarNome("Rodrigo"));

        System.out.println(agendaContatos.atualizarContato("rodrigo ferreira", 9999999));

        agendaContatos.imprimirContatos();
    }
}
