public sealed abstract class Colaborador permits Gerente, Vendedor {

    protected String codigo;
    protected String nome;
    protected String email;
    protected int idade;
    protected String endereco;
    protected String funcao;
    protected double salario;

    public Colaborador(
                String codigo,
                String nome,
                String email,
                int idade,
                String endereco,
                String funcao,
                double salario
    ) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
        this.funcao = funcao;
        this.salario = salario;
    }

    public abstract double getTotalSalario();

    public double getSalario() {
        return salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

}
