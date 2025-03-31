public class CepPreencher {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("87594734");
            System.out.println(cepFormatado);
            
        } catch (CepInvalidoException e) {
            System.out.println("O CEP informado não corresponde ao formato padrão.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        // ...
        // ...
        // Após modificar a string no formato desejado, retorna o resultado
        return cep;
    }
}
