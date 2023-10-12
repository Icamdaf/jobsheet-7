import java.util.Scanner;

/**
 * Forkelipatan20
 */
public class Forkelipatan20 {

    public static void main(String[] args) {
    Scanner Scan20 = new Scanner(System.in);

    int jumlah = 0;
    int kelipatan ;
    int counter = 0;
    int total = 0;

    System.out.print("masukkan bilangan kelipatan (1-9) :   ");
    kelipatan = Scan20.nextInt();
    for (int i = 1;i <= 50; i++){
        if (i % kelipatan == 0){
            total += i;
            counter++;

            System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah  %d\n", kelipatan, counter);
            System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah  %d\n", kelipatan, total);

         double rataRata = (double) total / counter;
         System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }

        }
    }

    }
    
