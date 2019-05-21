/* 1. Buatlah sebuah program perulangan sederhana dengan output angka 1-10 dengan menggunakan
        perulangan while, do-while dan for didalam 1 kelas bernama PerulanganJava. Kemudian lanjutkan
        hingga program yang anda buat bisa menampilkan total 10 angka dari perulangan tersebut. */

public class PerulanganJava {
    public static void main(String[] args) {
        int i = 0,sum = 0;
        while(i < 10){
            i++;
            System.out.print(i + "\n");
            sum+=i;
        }
        System.out.print("Total = " + sum + "\n\n");

        i = 0;
        sum = 0;
        do {
            i++;
            System.out.print(i + "\n");
            sum+=i;
        }
        while(i<10);

        System.out.print("Total = " + sum + "\n\n");

        sum = 0;
        for(i = 1; i<=10; i++) {
            System.out.print(i + "\n");
            sum+=i;
        }
        System.out.print("Total = " + sum + "\n\n");
    }
}
