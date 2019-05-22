import java.util.Scanner;

public class Latihan5 {

    public static void main(String[] args) {
        PopulateObjek lingkaran = new PopulateObjek();
        lingkaran.hitungLuasLingkaran(10);
        System.out.println(lingkaran.luasLingkaran(20));

        PopulateObjek tabung = new PopulateObjek();
        Scanner dia = new Scanner(System.in);
        System.out.println("Diameter tabung (dalam cm): ");
        int diaInt = dia.nextInt();
        Scanner tin = new Scanner(System.in);
        System.out.println("Tinggi tabung (dalam cm): ");
        int tinInt = tin.nextInt();
        System.out.println("Volume tabung : " + tabung.volumeTabung(diaInt, tinInt));

        PopulateObjek kerucut = new PopulateObjek();
        Scanner diameter = new Scanner(System.in);
        System.out.println("Diameter kerucut (dalam cm): ");
        int diameterInt = diameter.nextInt();
        Scanner tinggi = new Scanner(System.in);
        System.out.println("Tinggi kerucut (dalam cm): ");
        int tinggiInt = tinggi.nextInt();
        System.out.println("Volume kerucut : " + kerucut.volumeKerucut(diameterInt, tinggiInt));

        PopulateObjek bola = new PopulateObjek();
        Scanner d = new Scanner(System.in);
        System.out.println("Diameter bola (dalam cm) ");
        int dInt = d.nextInt();
        System.out.println(bola.volumeBola(dInt));

    }

}
