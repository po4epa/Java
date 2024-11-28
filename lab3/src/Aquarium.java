public class Aquarium extends Enclosure {
    @Override
    public void describe() {
        System.out.println("Это аквариум, предназначен для водоплавающих животных.");
        for (Animal animal : animals) {
            animal.move();
        }
    }
}