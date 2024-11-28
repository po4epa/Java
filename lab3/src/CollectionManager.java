import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CollectionManager {
    public void processArrayList(int size, DataGenerator generator, OperationLogger logger) {
        ArrayList<Animal> arrayList = new ArrayList<>();
        processCollection(arrayList, size, generator, logger);
    }

    public void processLinkedList(int size, DataGenerator generator, OperationLogger logger) {
        LinkedList<Animal> linkedList = new LinkedList<>();
        processCollection(linkedList, size, generator, logger);
    }

    private void processCollection(java.util.List<Animal> collection, int size, DataGenerator generator, OperationLogger logger) {
        Random random = new Random();
        long startTime, endTime;

        // Добавление элементов
        logger.log("Start adding elements to collection");
        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            collection.add(generator.generateAnimal());
            endTime = System.nanoTime();
            logger.log("add", i, endTime - startTime);
        }

        // Изменение 10% элементов
        logger.log("Start modifying elements in collection");
        for (int i = 0; i < size / 10; i++) {
            int index = random.nextInt(collection.size());
            startTime = System.nanoTime();
            collection.set(index, generator.generateAnimal());
            endTime = System.nanoTime();
            logger.log("set", index, endTime - startTime);
        }

        // Удаление 10% элементов
        logger.log("Start removing elements from collection");
        for (int i = 0; i < size / 10; i++) {
            int index = random.nextInt(collection.size());
            startTime = System.nanoTime();
            collection.remove(index);
            endTime = System.nanoTime();
            logger.log("remove", index, endTime - startTime);
        }

        logger.finalizeLog();
    }
}
