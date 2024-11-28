public class Ungulate extends Animal {
    public Ungulate(String name, int age, double weight) {
        super(name, age, weight); // Исправлено: порядок аргументов
    }

    @Override
    public void move() {
        System.out.println(getName() + " is walking on the ground.");
    }
}
