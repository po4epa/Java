import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private int errorCount = 0;
    private FileWriter writer;

    public Logger(String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }

    public void log(String message) throws IOException {
        writer.write(message + "\n");
    }

    public void error(String errorMessage) throws IOException {
        errorCount++;
        log("ERROR: " + errorMessage);
    }

    public void close() throws IOException {
        writer.close();
    }

    public int getErrorCount() {
        return errorCount;
    }
}
