import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private List<String> errors = new ArrayList<>();
    private int errorCount = 0;

    public void logError(String message) {
        errors.add(message);
        errorCount++;
        System.err.println("Error: " + message);
    }

    public int getErrorCount() {
        return errorCount;
    }

    public List<String> getErrors() {
        return errors;
    }
}
