public class Bird extends Animal {
    public Bird(String name, int age, double weight) {
        super(name, age, weight); // Правильный порядок аргументов
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying in the sky.");
    }
}