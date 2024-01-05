public interface BudowniczyRaportu {
    void dodajHeader();
    void dodajBody();
    void dodajFooter();
    RaportZamowien getRaport();
}
