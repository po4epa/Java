import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OperationLogger {
    private BufferedWriter writer;
    private long totalTime;
    private int operationCount;

    public OperationLogger(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write("Start program: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
    }

    public void log(String operation, int index, long time) throws IOException {
        writer.write(operation + ", ID = " + index + ", Time = " + time + " ns\n");
        totalTime += time;
        operationCount++;
    }

    public void log(String message) throws IOException {
        writer.write(message + "\n");
    }

    public void finalizeLog() throws IOException {
        writer.write("Total operations = " + operationCount + "\n");
        writer.write("Total time = " + totalTime + " ns\n");
        writer.write("Average time = " + (operationCount > 0 ? totalTime / operationCount : 0) + " ns\n");
        writer.write("Finish program: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n\n");
        writer.close();
    }
}
