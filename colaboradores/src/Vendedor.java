public final class Vendedor extends Colaborador {

    private double porcentagemVendas;
    private double totalVendas;

    public Vendedor(
            String codigo,
            String nome,
            String email,
            int idade,
            String endereco,
            String funcao,
            double salario,
            double porcentagemVendas,
            double totalVendas) {

        super(codigo, nome, email, idade, endereco, funcao, salario);

        this.porcentagemVendas = porcentagemVendas;
        this.totalVendas = totalVendas;
    }

    @Override
    public String getCodigo() {
        return "VD_" + super.getCodigo();
    }

    @Override
    public double getTotalSalario() {
        return this.salario + ((this.totalVendas * this.porcentagemVendas) / 100);
    }

    public void setPorcentagemVenda(double porcentagemVendas) {
        this.porcentagemVendas = porcentagemVendas;
    }

    public double getPorcentagemVenda() {
        return this.porcentagemVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

}