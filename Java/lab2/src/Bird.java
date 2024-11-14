public class Bird extends Animal {
    public Bird(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void move() {
        System.out.println("Летает в воздухе");
    }
}
