import java.util.Scanner;

public class Latihan5 {

    public static void main(String[] args) {
        PopulateObjek lingkaran = new PopulateObjek();
        PopulateObjek tabung = new PopulateObjek();
        PopulateObjek kerucut = new PopulateObjek();
        PopulateObjek bola = new PopulateObjek();

        Scanner dia = new Scanner(System.in);
        System.out.println("Diameter (dalam cm): ");
        int diaInt = dia.nextInt();
        Scanner tin = new Scanner(System.in);
        System.out.println("Tinggi(dalam cm): ");
        int tinInt = tin.nextInt();

        lingkaran.hitungLuasLingkaran(10);
        System.out.println(lingkaran.luasLingkaran(20));

        System.out.println("Volume tabung : " + tabung.volumeTabung(diaInt, tinInt));
        System.out.println("Volume kerucut : " + kerucut.volumeKerucut(diaInt, tinInt));
        bola.volumeBola(diaInt,tinInt);

    }
}
