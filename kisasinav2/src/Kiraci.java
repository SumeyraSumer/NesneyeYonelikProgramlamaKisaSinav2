public class Kiraci {
    private String name;
    private String surname;
    private EvSahibi evSahibi;

    public Kiraci(String name, String surname, EvSahibi evSahibi) {
        this.name = name;
        this.surname = surname;
        this.evSahibi = evSahibi;
    }

    public void displayInfo() {
        System.out.println("Kiracı: İsim: " + this.name + ", Soyisim: " + this.surname);
        System.out.println("Kiracının Ev Sahibi Bilgileri: ");
        this.evSahibi.displayInfo();
    }
}
