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

public class AverageValue {
    public static void main(String[] args) {
        double[] arr = {30,30,60};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Nilai reratanya : %.1f", average);
    }
}

