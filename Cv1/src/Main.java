public class Main {
    public static void main(String[] args) {
        var skola = new Skola("Stredna skola");
        var trieda = new Trieda("1.A");
        var trieda1 = new Trieda("2.A");
        var ucitel0 = new Ucitel("Janko", "Hrasko", "Ing.", "PhD.");
        var ucitel1 = new Ucitel("Ferko", "Hrasko", "Mgr.", "PhD.");
        var ucitel2 = new Ucitel("Jozef", "Hrasko", "doc.", "PhD.");
        var student0 = new Student("Pavol", "Slniecko", "25798/3326", 2);
        var student1 = new Student("Karol", "Slniecko", "23298/3426", 1);
        skola.pridatTriedu(trieda);
        skola.pridatTriedu(trieda1);
        skola.pridatUcitela(ucitel0);
        skola.pridatUcitela(ucitel1);
        skola.pridatUcitela(ucitel2);
        trieda.pridatStudenta(student0);
        trieda1.pridatStudenta(student1);
        trieda.pridatStudenta("Igor", "Slniecko", "25728/3396", 2);
        trieda1.pridatStudenta("Jakub", "Slniecko", "25745/3320", 1);
    }
}