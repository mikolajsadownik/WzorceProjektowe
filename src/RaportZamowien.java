import java.util.ArrayList;
import java.util.List;

public class RaportZamowien {
    private List<String> tresci = new ArrayList<>();

    public void dodajTresc(String tresc) {
        tresci.add(tresc);
    }

    public void wyswietlRaport() {
        for (String tresc : tresci) {
            System.out.println(tresc);
        }
    }
}
