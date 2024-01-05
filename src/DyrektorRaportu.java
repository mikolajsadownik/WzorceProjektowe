public class DyrektorRaportu {
    public void skonstruujRaport(BudowniczyRaportu budowniczy) {
        budowniczy.dodajHeader();
        budowniczy.dodajBody();
        budowniczy.dodajFooter();
    }
}
