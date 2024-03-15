public class ErrorLog extends Log {
    public ErrorLog(LogLevel level) {
        super(level);
    }

    @Override
    protected void PrintText(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
