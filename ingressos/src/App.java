public class App {
    public static void main(String[] args) throws Exception {

        Ingresso ingresso = new Ingresso();

        ingresso.setFilme("Meu Malvado Favorito 4");
        ingresso.setDublado(true);
        ingresso.setValor(40.0);

        System.out.println("Filme: " + ingresso.getFilme());
        System.out.println("Dublado: " + (ingresso.getDublado() ? "Sim" : "Não"));
        System.out.println("Ingresso: " + ingresso.getClass().getCanonicalName());
        System.out.println("Quantidade: " + ingresso.getQuantidadeIngressos());
        System.out.println("Valor: " + ingresso.getValor());
        System.out.println("Total: " + ingresso.getValorTotal());

        System.out.println("=========================================");

        MeiaEntrada ingressoMeia = new MeiaEntrada();

        ingressoMeia.setFilme("Um Filme Minecraft");
        ingressoMeia.setDublado(true);
        ingressoMeia.setValor(40.0);
        ingressoMeia.setQuantidadeIngressos(2);

        System.out.println("Filme: " + ingressoMeia.getFilme());
        System.out.println("Dublado: " + (ingressoMeia.getDublado() ? "Sim" : "Não"));
        System.out.println("Ingresso: " + ingressoMeia.getClass().getCanonicalName());
        System.out.println("Quantidade: " + ingressoMeia.getQuantidadeIngressos());
        System.out.println("Valor: " + ingressoMeia.getValor());
        System.out.println("Total: " + ingressoMeia.getValorTotal());
        System.out.println(
                "OBS: Desconto de " + ingressoMeia.getDesconto() + "% (R$ " + ingressoMeia.getValorDesconto() + ")");

        System.out.println("=========================================");

        Familia ingressoFamilia = new Familia();

        ingressoFamilia.setFilme("O Mágico de Oz");
        ingressoFamilia.setDublado(true);
        ingressoFamilia.setValor(40.0);
        ingressoFamilia.setQuantidadeIngressos(4);

        System.out.println("Filme: " + ingressoFamilia.getFilme());
        System.out.println("Dublado: " + (ingressoFamilia.getDublado() ? "Sim" : "Não"));
        System.out.println("Tipo de ingresso: " + ingressoFamilia.getClass().getCanonicalName());
        System.out.println("Quantidade: " + ingressoFamilia.getQuantidadeIngressos());
        System.out.println("Valor: " + ingressoFamilia.getValor());
        System.out.println("Total: " + ingressoFamilia.getValorTotal());
        if (ingressoFamilia.getQuantidadeIngressos() > 3)
            System.out.println(
                    "OBS: Desconto de " + ingressoFamilia.getDesconto() + "% (R$ " + ingressoFamilia.getValorDesconto()
                            + ")");

    }
}
