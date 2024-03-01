import java.util.ArrayList;

public class Skola {
    private String nazov;
    private final ArrayList<Ucitel> zoznamUcitelov;
    private final ArrayList<Trieda> zoznamTried;

    public Skola(String nazov) {
        this.nazov = nazov;
        this.zoznamTried = new ArrayList<Trieda>();
        this.zoznamUcitelov = new ArrayList<Ucitel>();
    }

    public void pridatTriedu(Trieda trieda) {
        for (Trieda t: this.zoznamTried) {
            if (!t.getNazov().equals(trieda.getNazov())) {
                this.zoznamTried.add(trieda);
            } else {
                System.out.println("Taka trieda uz existuje");
            }
        }
    }

    public void pridatUcitela(Ucitel ucitel) {
        for (Ucitel u: this.zoznamUcitelov) {
            if (!u.getMeno().equals(ucitel.getMeno()) && !u.getPriezvisko().equals(ucitel.getPriezvisko())) {
                this.zoznamUcitelov.add(ucitel);
            } else {
                System.out.println("Taky ucitel uz existuje");
            }
        }
    }
}
