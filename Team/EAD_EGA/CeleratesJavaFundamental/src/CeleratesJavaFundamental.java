public class CeleratesJavaFundamental {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merkMobil = "Wuling";
        mobil.rangkaMobil = "325617";
        String merkMobil = mobil.merkMobil;
        String rangkaMobil = mobil.rangkaMobil;
        int rangkaMobilInt = new Integer(rangkaMobil);

        System.out.println("Mobil " + merkMobil + " nomor rangkanya " + rangkaMobilInt);

        String on = "Nyalakan mesin!";
        mobil.turnOn(on);

        mobil.turnOff();
        System.out.println(mobil.carSpeed());
        System.out.println("Jarak tempuh = " + mobil.jarakTempuh() + " meter");
    }
}