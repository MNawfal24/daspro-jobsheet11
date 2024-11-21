import java.util.Scanner;
public class hitungTotalHarga19 {
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo){
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Kode promo DISKON50 diterapkan: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; 
            System.out.println("Kode promo DISKON30 diterapkan: Diskon 30%");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Tidak ada diskon");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\nMasukkan nomor menu yang ingin anda pesan");
        int pilihanMenu = sc.nextInt();
        System.out.println("Masukkan jumlah item yang ingin anda pesan");
        int banyakItem = sc.nextInt();

         sc.nextLine();

        System.out.println(" Apakah ada kode promo ?, jika ada silahkan memasukkannya, jika tidak ada ketik (skip)");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp"+ totalHarga);
    }
}