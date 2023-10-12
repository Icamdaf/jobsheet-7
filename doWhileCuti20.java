import java.util.Scanner;

public class doWhileCuti20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti;
        int jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti = ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("apakah anda akan mengambil cuti? (y/t) ");
            konfirmasi = sc.next();

           
            if (konfirmasi.equalsIgnoreCase("t")) {
                
                break;
            } else if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari = ");
                jumlahHari = sc.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti = " + jatahCuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi. Silakan coba lagi.");
                }
            }

        } while (jatahCuti > 0);
    }
}