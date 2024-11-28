// Animal.java
public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public String getName() {
        return name;
    }
}
