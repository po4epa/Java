import java.util.ArrayList;

public abstract class Enclosure {
    protected ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public abstract void describe();
}