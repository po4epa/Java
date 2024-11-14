public abstract class Animal {
    protected double weight;
    protected int age;

    public Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public abstract void move();
}
