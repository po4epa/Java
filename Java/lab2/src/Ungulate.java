// Ungulate.java
public class Ungulate extends Animal {
    public Ungulate(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void move() {
        System.out.println("Идет по земле");
    }
}
