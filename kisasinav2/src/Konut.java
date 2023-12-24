public class Konut extends Bina {

    public Konut(String address, int numberOfFloors) {
        super(address, numberOfFloors);
    }

    @Override
    public void displayInfo() {
        System.out.println("Konut (miras alınan Bina bilgileri): ");
        super.displayInfo();
    }
}
