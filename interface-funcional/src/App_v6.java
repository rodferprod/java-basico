import java.util.List;
import java.util.function.Function;

public class App_v6 {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(
                new User("João", 56),
                new User("Maria", 46),
                new User("Pedro", 10),
                new User("Fábio", 4));

        imprimeObjetoComoString(users, Record::toString);
    }

    private static void imprimeObjetoComoString(
            List<User> users,
            Function<User, String> callback) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
