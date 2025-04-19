import map.contatos.AgendaContatos;

public class MapContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.listarContatos();

        agendaContatos.adicionarContato("Rodrigo", 4565468);
        agendaContatos.adicionarContato("Rafael", 5645665);
        agendaContatos.adicionarContato("Ricardo", 4798768);
        agendaContatos.adicionarContato("Rômulo", 98564874);
        agendaContatos.adicionarContato("Adriana", 54231234);
        // Aqui estamos atualizando o número da chave Rodrigo inserida no início
        agendaContatos.adicionarContato("Rodrigo", 87655676);
        agendaContatos.adicionarContato("Rodrigo José", 58687667);
        agendaContatos.adicionarContato("Rodrigo Guimarães", 321342334);
        // Aqui estamos atualizando novamente o número da chave Rodrigo
        agendaContatos.adicionarContato("Rodrigo", 521314254);

        agendaContatos.listarContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));

        agendaContatos.removerContato("Rodrigo José");

        agendaContatos.listarContatos();
    }
}