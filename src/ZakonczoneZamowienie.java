public class ZakonczoneZamowienie implements StanZamowienia {
    @Override
    public void przetwarzajZamowienie(Zamowienie zamowienie) {
        System.out.println("Zamówienie zostało dostarczone i jest zakończone.");
    }
}