import java.text.NumberFormat;
import java.text.ParseException;

public class Excecoes {
    public static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75");

            // Nessa linha a IDE já sinaliza que precisamos tratar
            // um possível erro que pode ser gerado. É o caso de uma
            // exceção checada.
            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        }
        catch (NumberFormatException e) {
            System.out.println("O formato do valor informado não é válido.");
        }
        catch (ParseException e) {
            System.out.println("Erro ao converter o campo numérico.");
        }
    }
}
