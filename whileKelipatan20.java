import java.util.Scanner;

public class whileKelipatan20 {

    public static void main(String[] args) {
        Scanner Scan20 = new Scanner(System.in);

        int kelipatan;
        int counter = 0;
        int total = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = Scan20.nextInt();

        int i = 1;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }

        // Menghitung rata-rata
        double rataRata = (double) total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}
