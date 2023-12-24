public class Daire implements Comparable<Daire> {
    private String address;
    private int floor;
    private int apartmentNumber;

    public Daire(String address, int floor, int apartmentNumber) {
        this.address = address;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }

    public void displayInfo() {
        System.out.println("Daire: Adres: " + this.address + ", Kat: " + this.floor + ", Numara: " + this.apartmentNumber);
    }

    @Override
    public int compareTo(Daire other) {
        return Integer.compare(this.apartmentNumber, other.apartmentNumber);
    }
}
