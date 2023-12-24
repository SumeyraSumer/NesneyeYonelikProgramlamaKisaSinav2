public class Bina {
    protected String address; // Konut sınıfı tarafından erişilebilir olması için protected yapılır.
    protected int numberOfFloors; // Konut sınıfı tarafından erişilebilir olması için protected yapılır.

    public Bina(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }

    public void displayInfo() {
        System.out.println("Bina: Adres: " + this.address + ", Kat Sayısı: " + this.numberOfFloors);
    }
}
