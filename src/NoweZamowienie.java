public class NoweZamowienie implements StanZamowienia {
    @Override
    public void przetwarzajZamowienie(Zamowienie zamowienie) {
        System.out.println("Przyjęto nowe zamówienie.");
        zamowienie.ustawStan(new PrzygotowywanieZamowienia());
    }
}
