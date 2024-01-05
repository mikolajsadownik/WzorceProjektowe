public class PrzygotowywanieZamowienia implements StanZamowienia {
    @Override
    public void przetwarzajZamowienie(Zamowienie zamowienie) {
        System.out.println("Zamówienie jest przygotowywane.");
        zamowienie.ustawStan(new DostawaZamowienia());
    }
}
