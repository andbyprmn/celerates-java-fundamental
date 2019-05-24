/* Sebuah perusahaan memberikan komisi kepada salesmannya dengan ketentuan sebagai berikut:

        - Bila seorang salesman dapat menjual barang hingga Rp 2.000.000,
        maka dia akan mendapat uang jasa sebesar Rp. 100.000 ditambah dengan
        uang komisi sebesar 10% dari pendapatan hari itu.
        - Bila seorang salesman dapat menjual barang di atas Rp. 2.000.000 hingga 5.000.000 maka dia
        akan mendapat uang jasa sebesar Rp 200.000 ditambah dengan uang komisi sebesar 15% dari
        pendapatan hari itu.
        - Bila seorang salesman dapat menjual barang di atas Rp. 5.000.000 maka dia akan mendapat uang
        jasa sebesar Rp. 300.000 ditambah dengan uang komisi sebesar 20% dari pendapatan hari itu.

        Bangunlah program(gunakan salah satu library I/O dalam Java) untuk menghitung pendapatan seorang salesman hari itu.

        Note :
        - Buat folder latihan-2 pada folder kalian yg telah dibuat sebelumnya, lalu taruh file java di dalam folder tersebut. */

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        double add = 0;
        Scanner sell = new Scanner(System.in); // Create a scanner object
        System.out.println("Input jumlah penjualan (contoh = 2000000) : ");
        double sellInt = sell.nextInt();
        if(sellInt >= 2000000) {
            add = add + 100000 + (0.1 * sellInt);
            System.out.println("Pendapatan salesman : " + add);
        } else if(sellInt > 2000000 && sellInt <= 5000000) {
            add = add + 200000 + (0.15 * sellInt);
            System.out.println("Pendapatan salesman :" + add);
        } else {
            add = add + 300000 + (0.2 * sellInt);
            System.out.println("Pendapatan salesman : " + add);
        }
    }
}
