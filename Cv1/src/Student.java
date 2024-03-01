public class Student {
    private String meno;
    private String priezvisko;
    private String rodneCislo;
    private int rocnik;

    public Student() {
    }

    public Student(String meno, String priezvisko, String rodneCislo, int rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rodneCislo = rodneCislo;
        this.rocnik = rocnik;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        this.rodneCislo = rodneCislo;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        if (rocnik > 0) {
            this.rocnik = rocnik;
        } else {
            System.out.println("Rocnik musi byt viac ako 0");
        }
    }

    @Override
    public String toString() {
        return "" + this.meno + " " + this.priezvisko + " " + " (" + this.rodneCislo + ") - " + this.rocnik + ". rocnik";
    }
}
