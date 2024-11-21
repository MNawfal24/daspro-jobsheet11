import java.util.Scanner;

public class TugasKeDua19 {

    static int[][] dataPenjualan = new int[5][7];
    static String [] menu = {"kopi", "teh", "es degan", "roti bakar", "gorengan"};
    public static void inputpenjualan() {
        Scanner sc = new Scanner(System.in);
        System.out.println (" Masukkan data penjualan : ");

        for (int i = 0; i < menu.length; i++) {
             System.out.println("Menu: " + menu[i]);
                 for (int j = 0; j < 7; j++) {
                     System.out.print("Hari ke-" + (j + 1) + ": ");
                        dataPenjualan[i][j] = sc.nextInt();

                }
            }
            System.out.println(" Data telah di masukkan ");
    }
    
    public static void tampilkanPenjualan() {
        System.out.println(" rekap data penjualan: "); 
        System.out.print("Menu              ");
        for (int j = 1; j < menu.length; j ++) {
               System.out.print("Hari ke-" + j + "\t");
        }
         System.out.println();
        
         for (int i = 0; i < menu.length; i ++) {
            System.out.print(menu[i] + "           ");
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + "\t\t");
            }
            System.out.println();
         }
    }

    public static void menuPenjualanTertinggi () {
        int maksPenjualan = 0;
        String MenuTertinggi = " ";

        for (int i = 0; i < menu.length; i++){
            int totalPenjualan = 0;
                for (int j = 0; j < 7; j++) {
                    totalPenjualan += dataPenjualan[i][j];
                }
            if (totalPenjualan > maksPenjualan) {
                maksPenjualan = totalPenjualan;
                MenuTertinggi = menu [i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + MenuTertinggi "(Total : " + maksPenjualan + ")");
    }

    public static void ratarata() {
        System.out.println("Rata - rata penjualan untuk setiap menu: ");
        for (int i = 0; i < menu.length; i ++) {
            int totalPenjualan = 0 ;
            for (int j = 0; j < 7; j++){
                totalPenjualan += dataPenjualan[i][j];
            }
            double Rata2 = (double) totalPenjualan / 7;
            System.out.println (menu[i] + " : " + Rata2);
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        inputpenjualan();
        tampilkanPenjualan();
        menuPenjualanTertinggi();
        ratarata();
    }
}