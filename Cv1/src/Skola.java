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
        boolean existuje = false;
        for (Trieda t : this.zoznamTried) {
            if (t.getNazov().equals(trieda.getNazov())) {
                existuje = true;
                break;
            }
        }
        if (!existuje) {
            this.zoznamTried.add(trieda);
        } else {
            System.out.println("Taka trieda uz existuje");
        }
    }

    public void pridatUcitela(Ucitel ucitel) {
        boolean existuje = false;
        for (Ucitel u: this.zoznamUcitelov) {
            if (!u.getMeno().equals(ucitel.getMeno()) && !u.getPriezvisko().equals(ucitel.getPriezvisko())) {
                existuje = true;
                break;
            }
        }
        if (!existuje) {
            this.zoznamUcitelov.add(ucitel);
        } else {
            System.out.println("Taky ucitel uz existuje");
        }
    }

    public boolean pridatStudentaDoTrieda(String nazovTriedy, Student student) {
        boolean podariloSa = false;
        for (Trieda t: this.zoznamTried) {
            if (t.getNazov().equals(nazovTriedy)) {
                t.pridatStudenta(student);
                podariloSa = true;
            }
        }
        return podariloSa;
    }

    public void vypisTried() {
        System.out.println(this.nazov);
        System.out.println("Zoznam tried:");
        for (Trieda t: this.zoznamTried) {
            System.out.println(t.getNazov());
        }
    }

    public void vypisUcitelov() {
        System.out.println(this.nazov);
        System.out.println("Zoznam ucitelov:");
        int cislo = 1;
        for (Ucitel u: this.zoznamUcitelov) {
            System.out.printf("%d. %s%n", cislo, u);
            cislo++;
        }
    }

    public void vypisVsetko() {
        this.vypisUcitelov();
        System.out.println("Zoznam tried:");
        for (Trieda t: this.zoznamTried) {
            t.vypis();
        }
    }
}
