public class DostawaZamowienia implements StanZamowienia {
    @Override
    public void przetwarzajZamowienie(Zamowienie zamowienie) {
        System.out.println("Zamówienie w  dostawie");
        zamowienie.ustawStan(new ZakonczoneZamowienie());
    }
}
