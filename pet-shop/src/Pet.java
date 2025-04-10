public class Pet {

    private final String name;

    private boolean cleaned;

    public Pet(String name) {
        this.name = name;
        this.cleaned = false;
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }

    public boolean isCleaned() {
        return cleaned;
    }

    public String getName() {
        return name;
    }
}