public class ColdBlooded extends Animal {
    public ColdBlooded(String name, int age, double weight) {
        super(name, age, weight); // Исправлено: порядок аргументов
    }

    @Override
    public void move() {
        System.out.println(getName() + " is crawling on the ground.");
    }
}
