public class FileLog extends Log {
    public FileLog(LogLevel level) {
        super(level);
    }

    @Override
    protected void PrintText(String message) {
        System.out.println("File::Logger: " + message);
    }
}
