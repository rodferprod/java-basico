public non-sealed class Gerente extends Colaborador {

    private String login;
    private String senha;
    private double comissao;

    public Gerente(
            String codigo,
            String nome,
            String email,
            int idade,
            String endereco,
            String funcao,
            double salario,
            String login,
            String senha,
            double comissao) {
        super(codigo, nome, email, idade, endereco, funcao, salario);

        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    @Override
    public String getCodigo() {
        return "GR_" + super.getCodigo();
    }

    @Override
    public double getTotalSalario() {
        return this.salario + this.comissao;
    }

    // Sobrecarga de método
    public double getTotalSalario(double extra) {
        return this.getTotalSalario() + extra;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
