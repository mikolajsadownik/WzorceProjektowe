public class InfoLogger extends Logger {
    public InfoLogger(int poziom) {
        this.poziom = poziom;
    }

    @Override
    protected void zapiszLog(String wiadomosc) {
        System.out.println("Info: " + wiadomosc);
    }
}
