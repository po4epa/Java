// Aquatic.java
public class Aquatic extends Animal {
    public Aquatic(String name, int age, double weight) {
        super(name, age, weight); // Передача параметров в правильном порядке
    }

    @Override
    public void move() {
        System.out.println(getName() + " is swimming in the water.");
    }
}
