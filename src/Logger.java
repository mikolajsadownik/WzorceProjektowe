public abstract class Logger {
    protected int poziom;
    protected Logger nastepnyLogger;

    public void ustawNastepnyLogger(Logger nastepnyLogger) {
        this.nastepnyLogger = nastepnyLogger;
    }

    public void loguj(String wiadomosc, int poziom) {
        if (this.poziom <= poziom) {
            zapiszLog(wiadomosc);
        }
        if (nastepnyLogger != null) {
            nastepnyLogger.loguj(wiadomosc, poziom);
        }
    }

    abstract protected void zapiszLog(String wiadomosc);
}
