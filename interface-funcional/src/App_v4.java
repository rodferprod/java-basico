import java.util.List;

public class App_v4 {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(
                new User("João", 56),
                new User("Maria", 46),
                new User("Pedro", 10),
                new User("Fábio", 4));

        // Simplificando App v3
        // para uma expressão Lambda
        // omitindo a tipagem do parâmetro
        users.forEach(user -> System.out.println(user));
    }
}
