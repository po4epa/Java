public class ColdBlooded extends Animal {
    public ColdBlooded(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void move() {
        System.out.println("Ползет по земле");
    }
}
