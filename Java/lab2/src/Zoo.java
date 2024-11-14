public class Zoo {
    private Enclosure aquarium = new Aquarium();
    private Enclosure meshEnclosure = new MeshEnclosure();
    private Enclosure openEnclosure = new OpenEnclosure();
    private Enclosure infraredEnclosure = new InfraredEnclosure();

    public void addAnimalToEnclosure(Animal animal) {
        if (animal instanceof Aquatic) {
            aquarium.addAnimal(animal);
        } else if (animal instanceof Bird) {
            meshEnclosure.addAnimal(animal);
        } else if (animal instanceof Ungulate) {
            openEnclosure.addAnimal(animal);
        } else if (animal instanceof ColdBlooded) {
            infraredEnclosure.addAnimal(animal);
        }
    }

    public void showZoo() {
        aquarium.describe();
        meshEnclosure.describe();
        openEnclosure.describe();
        infraredEnclosure.describe();
    }
}
