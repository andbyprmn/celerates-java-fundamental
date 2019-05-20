/* Soal Latihan 1

        1. Buatlah program untuk menghitung nilai rata2 dari tiga angka berikut ini 30, 30, 60.
        2. Bangunlah sebuah program untuk menghitung gaji bersih setelah dipotong pajak 10%.
        Input   : gajikotor.
        Proses  : potongan = pajak*gajikotor,
        Gajibersih = gajikotor - potongan.
        Output  : gajibersih

        Notes :
        - Kumpulkan tugas/source kalian di dalam folder nama yg telah kalian buat dengan
        membuat folder latihan-1, lalu taruh source project kalian disana.
        - Kerjakan tugas kalian pada git branch yg sudah kalian buat,
        kemudian setelah selesai lalu merge ke master. */

import java.util.Scanner;
import java.lang.String;

public class Salary {
    public static void main(String[] args) {
        Scanner gajiKotor = new Scanner(System.in); // Create a scanner object
        System.out.println("Input gaji kotor: ");
        double gajiKotorInt = gajiKotor.nextInt();
        double potongan = 0.1 * gajiKotorInt;
        double gajiBersih = gajiKotorInt - potongan;
        System.out.println(gajiBersih);

    }
}
