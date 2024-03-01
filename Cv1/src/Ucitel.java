public class Ucitel {
    private String meno;
    private String priezvisko;
    private String titlePred;
    private String titulZa;

    public Ucitel(String meno, String priezvisko, String titlePred, String titulZa) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.titlePred = titlePred;
        this.titulZa = titulZa;
    }

    public Ucitel() {
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

    public String getTitlePred() {
        return titlePred;
    }

    public void setTitlePred(String titlePred) {
        this.titlePred = titlePred;
    }

    public String getTitulZa() {
        return titulZa;
    }

    public void setTitulZa(String titulZa) {
        this.titulZa = titulZa;
    }

    @Override
    public String toString() {
        return "" + this.titlePred + " " + this.meno + " " + this.priezvisko + " " + this.titulZa;
    }
}
