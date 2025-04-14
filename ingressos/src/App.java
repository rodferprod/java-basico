public class App {
    public static void main(String[] args) throws Exception {

        MeiaEntrada ingressoMeia = new MeiaEntrada();

        ingressoMeia.setFilme("Um Filme Minecraft");
        ingressoMeia.setDublado(true);
        ingressoMeia.setValor(40.0);
        System.out.println("Ingresso: " + ingressoMeia.getClass().getCanonicalName());
        System.out.println("Filme: " + ingressoMeia.getFilme());
        System.out.println("Dublado: " + (ingressoMeia.getDublado() ? "Sim" : "Não"));
        System.out.println("Valor: " + ingressoMeia.getValor());
        System.out.println("Total: " + ingressoMeia.getValorTotal());
        System.out.println(
                "OBS: Desconto de " + ingressoMeia.getDesconto() + "% (R$ " + ingressoMeia.getValorDesconto() + ")");

        Familia ingressoFamilia = new Familia();

        ingressoFamilia.setFilme("O Mágico de Oz");
        ingressoFamilia.setDublado(true);
        ingressoFamilia.setValor(40.0);

        System.out.println("Ingresso: " + ingressoFamilia.getClass().getCanonicalName());
        System.out.println("Filme: " + ingressoFamilia.getFilme());
        System.out.println("Dublado: " + (ingressoFamilia.getDublado() ? "Sim" : "Não"));
        System.out.println("Valor: " + ingressoFamilia.getValor());
        System.out.println("Total: " + ingressoFamilia.getValorTotal());
        if (ingressoFamilia.getQuantidadeIngressos() > 3)
            System.out.println(
                    "OBS: Desconto de " + ingressoFamilia.getDesconto() + "% (R$ " + ingressoFamilia.getValorDesconto()
                            + ")");

    }
}
