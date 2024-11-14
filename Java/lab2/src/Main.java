public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimalToEnclosure(new Aquatic(15.5, 10));
        zoo.addAnimalToEnclosure(new Bird(1.2, 2));
        zoo.addAnimalToEnclosure(new Ungulate(300, 5));
        zoo.addAnimalToEnclosure(new ColdBlooded(0.5, 1));
        zoo.showZoo();
    }
}
