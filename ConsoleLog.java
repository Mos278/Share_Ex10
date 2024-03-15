public class ConsoleLog extends Log {
    public ConsoleLog(LogLevel level) {
        super(level);
    }

    @Override
    protected void PrintText(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
