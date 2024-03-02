public class Trieda {
    private final int kapacita = 30;
    private String nazov;
    private Student[] zoznamStudentov;

    public Trieda(String nazov) {
        this.nazov = nazov;
        this.zoznamStudentov = new Student[kapacita];
    }

    public int getKapacita() {
        return kapacita;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void getZoznamStudentov() {
        for (Student s: this.zoznamStudentov) {
            System.out.println(s);
        }
    }

    public boolean pridatStudenta(Student student) {
        boolean podariloSa = false;
        for (int i = 0; i < this.zoznamStudentov.length; i++) {
            if (this.zoznamStudentov[i] == null) {
                this.zoznamStudentov[i] = student;
                podariloSa = true;
                break;
            }
            if (!podariloSa) {
                System.out.println("Nepodarilo sa pridat studenta");
            }
        }
        return podariloSa;
    }

    public boolean pridatStudenta(String meno, String priezvisko, String rodneCislo, int rocnik) {
        boolean podariloSa = false;
        for (int i = 0; i < this.zoznamStudentov.length; i++) {
            if (this.zoznamStudentov[i] == null) {
                this.zoznamStudentov[i] = new Student(meno, priezvisko, rodneCislo, rocnik);
                podariloSa = true;
                break;
            }
        }
        if (!podariloSa) {
            System.out.println("Nepodarilo sa pridat studenta podla mena");
        }
        return podariloSa;
    }

    public boolean odobratStudenta(String rodneCislo) {
        boolean podariloSa = false;
        for (int i = 0; i < this.zoznamStudentov.length; i++) {
            if (this.zoznamStudentov[i].getRodneCislo().equals(rodneCislo)) {
                this.zoznamStudentov[i] = null;
                podariloSa = true;
            }
        }
        return podariloSa;
    }

    public void vypis() {
        int poradie = 1;
        System.out.printf("Trieda %s:%n", this.nazov);
        for (int i = 0; i < this.zoznamStudentov.length; i++) {
            if (this.zoznamStudentov[i] != null) {
                System.out.printf("%d. %s %s%n", poradie, this.zoznamStudentov[i].getMeno(), this.zoznamStudentov[i].getPriezvisko());
                poradie++;
            } else {
                int dalsiaPozicia = i + 1;
                while (dalsiaPozicia < this.zoznamStudentov.length && this.zoznamStudentov[dalsiaPozicia] == null) {
                    dalsiaPozicia++;
                }
                if (dalsiaPozicia < this.zoznamStudentov.length) {
                    System.out.printf("%d. %s %s%n", poradie, this.zoznamStudentov[dalsiaPozicia].getMeno(), this.zoznamStudentov[dalsiaPozicia].getPriezvisko());
                    poradie++;
                }
            }
        }
    }
}
