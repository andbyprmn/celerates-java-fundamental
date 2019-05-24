import java.lang.String;

public class Mobil {

    String merkMobil = "Wuling";
    String warnaMobil;
    String tipeMobil;
    int maxSpeed = 40;
    String rangkaMobil;

    // Method Procedure
    void turnOn(String turnedOn) {
        System.out.println(turnedOn);
    }

    void turnOff() {
        System.out.println("Mesin mati");
    }

    // Method Function
    int carSpeed() {
        if(maxSpeed==40)
            return 40;
        return maxSpeed;
    }

    int jarak = 90, kecepatan = 60, waktu = 3600;

    int jarakTempuh() {
        int hitungJarak = kecepatan*waktu;
        return hitungJarak;
    }

    int waktuTempuh() {
        int hitungWaktu = jarak/kecepatan;
        return hitungWaktu;
    }
}
