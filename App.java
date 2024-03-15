public class App {
    public static void main(String[] args) {
        Log errorLogger = new ErrorLog(LogLevel.ERROR);
        Log fileLogger = new FileLog(LogLevel.DEBUG);
        Log consoleLogger = new ConsoleLog(LogLevel.INFO);

        errorLogger.setLogger(fileLogger);
        fileLogger.setLogger(consoleLogger);

        System.out.println("----------------------------");
        errorLogger.logMessage(LogLevel.INFO, "This is an information.");
        System.out.println("----------------------------");
        errorLogger.logMessage(LogLevel.DEBUG, "This is a debug information.");
        System.out.println("----------------------------");
        errorLogger.logMessage(LogLevel.ERROR, "This is an error information.");
        
    }
}
