import java.util.ArrayList;
import java.util.List;

public class EvSahibi {
    private String name;
    private String surname;
    private List<Daire> daireler;

    public EvSahibi(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.daireler = new ArrayList<>();
    }

    public void addApartment(Daire daire) {
        daireler.add(daire);
    }

    public void displayInfo() {
        System.out.println("Ev Sahibi: İsim: " + this.name + ", Soyisim: " + this.surname);
        System.out.println("-- Sahip Olunan Daireler --");
        for (Daire daire : daireler) {
            daire.displayInfo();
        }
    }
}
