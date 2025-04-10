public class App {
    public static void main(String[] args) throws Exception {
        var person1 = new Person("Jonas", 35);

        person1.setHeight(76);

        System.out.println("Nome: " + person1.name() + " Idade: " + person1.age() + " Peso: " + person1.getHeight());

        var person2 = new Person("Marcelo");

        person2.setHeight(4);

        System.out.println("Nome: " + person2.name() + " Idade: " + person2.age() + " Peso: " + person2.getHeight());

    }
}
