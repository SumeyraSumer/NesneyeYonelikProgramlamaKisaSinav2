public class Main {
    public static void main(String[] args) {
        System.out.println("Uygulama Başladı...\n");

        System.out.println("Nesneye Yönelik Programlama Dersi Kısa Sınav 2");
        System.out.println("Sümeyra Sümer");
        System.out.println("5210505067");

        System.out.println("--------------------------------------------------------------------------------------------");

        Bina bina = new Bina("Bademlik Mahallesi 9. Cadde", 10);
        Konut konut = new Konut("Bademlik Mahallesi 9. Cadde Numara 10", 6);
        EvSahibi evSahibi = new EvSahibi("Sümeyra", "Sümer");
        Daire daire1 = new Daire("Bademlik Mahallesi 9. Cadde Numara 10", 5, 13);
        Daire daire2 = new Daire("Bademlik Mahallesi 9. Cadde", 6, 17);

        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);

        Kiraci kiraci = new Kiraci("Müjgan", "Yılmaz", evSahibi);

        System.out.println("Bina Bilgileri:");
        bina.displayInfo();
        System.out.println("\nKonut Bilgileri (Bina'dan miras alınan):");
        konut.displayInfo();
        System.out.println("\nEv Sahibi ve Daire Bilgileri:");
        evSahibi.displayInfo();
        System.out.println("\nKiracı Bilgileri:");
        kiraci.displayInfo();

        System.out.println("\nUygulama Sonlandı.");
    }
}
