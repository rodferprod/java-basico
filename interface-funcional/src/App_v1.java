import java.util.List;
import java.util.function.Consumer;

public class App_v1 {
    public static void main(String[] args) throws Exception {

        // List é uma interface para criação de coleções (arrays).
        // Declaramos o tipo dos itens retornados pela List
        // entre os sinais de menor (<) e maior (>)
        List<User> users = List.of(
                new User("João", 56),
                new User("Maria", 46),
                new User("Pedro", 10),
                new User("Fábio", 4));

        // Um Consumer é uma interface funcional, que é a
        // base para a criação de expressões Lambda
        var consumer = new Consumer<User>() {

            @Override
            public void accept(User user) {
                System.out.println(user);
            }

        };

        users.forEach(consumer);
    }
}
