public class DziennyRaportZamowienBuilder implements BudowniczyRaportu {
    private RaportZamowien raport = new RaportZamowien();

    @Override
    public void dodajHeader() {
        raport.dodajTresc("Nagłówek ");
    }

    @Override
    public void dodajBody() {
        raport.dodajTresc("Szczegóły Zamówień. .  .");
    }

    @Override
    public void dodajFooter() {
        raport.dodajTresc(" Stopka Raportu ");
    }

    @Override
    public RaportZamowien getRaport() {
        return raport;
    }
}
