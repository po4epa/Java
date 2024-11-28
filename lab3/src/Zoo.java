import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimalToEnclosure(Animal animal) {
        animals.add(animal);
    }

    public int getAnimalCount() {
        return animals.size();
    }
}
