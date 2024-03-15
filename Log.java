public abstract class Log {
    protected LogLevel level;
    protected Log next;

    public Log(LogLevel level) {
        this.level = level;
    }

    public void setLogger(Log lognext) {
        if(next != null) {
            next.setLogger(lognext);
        }
        else {
            next = lognext;
        }
    }

    public void logMessage(LogLevel level, String message) {
        if (this.level.getLevel() <= level.getLevel()) {
            PrintText(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void PrintText(String message);

}

