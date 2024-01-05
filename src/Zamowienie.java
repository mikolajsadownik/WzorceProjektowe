public class Zamowienie {
    private StanZamowienia stan;

    public Zamowienie() {
        stan = new NoweZamowienie();
    }

    public void ustawStan(StanZamowienia stan) {
        this.stan = stan;
    }

    public void nastepnyStan() {
        stan.przetwarzajZamowienie(this);
    }
}
