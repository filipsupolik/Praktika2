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

    public void setZoznamStudentov(Student[] zoznamStudentov) {
        this.zoznamStudentov = zoznamStudentov;
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
            if (!podariloSa) {
                System.out.println("Nepodarilo sa pridat studenta podla mena");
            }
        }
        return podariloSa;
    }
}
