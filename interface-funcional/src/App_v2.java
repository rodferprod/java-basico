import java.util.List;
import java.util.function.Consumer;

public class App_v2 {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(
                new User("João", 56),
                new User("Maria", 46),
                new User("Pedro", 10),
                new User("Fábio", 4));

        // Simplificando App v1
        users.forEach(new Consumer<User>() {

            @Override
            public void accept(User user) {
                System.out.println(user);
            }

        });
    }
}
