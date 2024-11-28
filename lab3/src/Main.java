public class Main {
    public static void main(String[] args) {
        try {
            // Инициализация менеджера коллекций и логгера
            CollectionManager manager = new CollectionManager();
            OperationLogger logger = new OperationLogger("operations.log");

            // Генерация данных
            DataGenerator generator = new DataGenerator();

            System.out.println("=== Начало работы программы ===");

            // Эксперименты с коллекциями для разных размеров
            int[] sizes = {10, 100, 1000, 10000, 100000};
            for (int size : sizes) {
                System.out.println("\nОбработка коллекций для размера: " + size);

                // Работа с ArrayList
                System.out.println("Работа с ArrayList");
                manager.processArrayList(size, generator, logger);

                // Работа с LinkedList
                System.out.println("Работа с LinkedList");
                manager.processLinkedList(size, generator, logger);
            }

            System.out.println("=== Конец работы программы ===");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
