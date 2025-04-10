public class PetMachine {
    private boolean cleaned = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeShower() {

        if (!this.checkLevels())
            return;

        if (this.pet == null) {
            System.out.println("-------> Coloque o pet na máquina de banho!");
            return;
        }
        if (this.pet.isCleaned()) {
            System.out.println("-------> O pet " + pet.getName() + " já está limpo e não precisa de outro banho.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setCleaned(true);
        System.out.println("-------> O pet " + pet.getName() + " terminou o banho e já está limpinho!");
    }

    public void addWater() {
        if (this.water == 30) {
            System.out.println("-------> A capacidade máxima de água da máquina foi alcançada.");
            return;
        }

        this.water += 2;
        System.out.println("-------> O nível de água da máquina está em " + this.water + " litros.");
    }

    public void addShampoo() {
        if (this.shampoo == 10) {
            System.out.println("-------> A capacidade máxima de shampoo da máquina foi alcançada.");
            return;
        }

        this.shampoo += 2;
        System.out.println("-------> O nível de shampoo da máquina está em " + this.shampoo + " litros.");
    }

    public int getWater() {
        return this.water;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public boolean isCleaned() {
        return this.cleaned;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void removePet() {
        if (!this.hasPet()) {
            System.out.println("-------> A máquina está vazia e pronta para ser usada.");
            return;
        }
        if (!this.pet.isCleaned()) {
            System.out.println("-------> O pet " + this.pet.getName() + " ainda não foi lavado.");
            return;
        }

        System.out.println("-------> O pet " + this.pet.getName() + " já saiu da máquina.");
        this.cleaned = !this.pet.isCleaned();
        this.pet = null;
    }

    public void cleanMachine() {

        if (!this.checkLevels())
            return;

        if (this.hasPet()) {
            System.out.println("-------> A máquina está ocupada com o pet " + this.pet.getName() + " no momento.");
            return;
        }
        if (this.cleaned) {
            System.out.println("-------> A máquina já está limpa e não precisa ser lavada.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.cleaned = true;
        System.out.println("-------> A máquina está limpa e pronta para receber um pet.");
    }

    public boolean checkLevels() {
        if (this.water < 10) {
            System.out.println("-------> A máquina está com nível insuficiente de água para realizar a operação.");
            return false;
        } else if (this.shampoo < 2) {
            System.out.println("-------> A máquina está com nível insuficiente de shampoo para realizar a operação.");
            return false;
        } else {
            return true;
        }
    }
}
