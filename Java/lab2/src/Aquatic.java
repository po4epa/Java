public class Aquatic extends Animal {
    public Aquatic(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void move() {
        System.out.println("Плавает в воде");
    }
}