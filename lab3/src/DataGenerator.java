import java.util.Random;

public class DataGenerator {
    private static final String[] NAMES = {"Lion", "Tiger", "Elephant", "Giraffe", "Zebra"};

    public Animal generateAnimal() {
        Random random = new Random();
        String name = NAMES[random.nextInt(NAMES.length)];
        int age = random.nextInt(20) + 1; // Возраст от 1 до 20
        double weight = 50 + random.nextDouble() * 500; // Вес от 50 до 550
        return new Animal(name, age, weight);
    }
}
