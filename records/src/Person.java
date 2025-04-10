public record Person(String name, int age) {

    private static int height;

    public Person {

    }

    public Person(String name) {
        this(name, 0);
    }

    public void setHeight(int height) {
        Person.height = height;
    }

    public int getHeight() {
        return height;
    }
}
