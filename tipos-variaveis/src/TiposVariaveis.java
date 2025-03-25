public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 12;
        short ano = 2025;
        int cep = 25954300;
        long cpf = 98765432109L; // precisa especificar L no final
        float PI = 3.14F; // precisa especificar F no final
        double salario = 2305.55;
        boolean isImage = false;
        char sexo = 'M'; // aceita apenas um caractere
        
        // Java é uma linguagem fortemente tipada.
        // "ano" suporta um range menor de números, gerando erro de compilação
        // Ex.: ano = (short) cep;
        // deve-se realizar um "cast" e converter "cep" (int) para o tipo "short"

        System.out.println("idade: " + idade);
        System.out.println("ano: " + ano);
        System.out.println("cep: " + cep);
        System.out.println("cpf: " + cpf);
        System.out.println("PI: " + PI);
        System.out.println("salario: " + salario);
        System.out.println("isImage: " + isImage);
        System.out.println("sexo: " + sexo);
    }
}
