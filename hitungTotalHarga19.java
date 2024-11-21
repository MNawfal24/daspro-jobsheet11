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
        int totalHargaKeseluruhan = 0; 
        String keadaan;

        System.out.println("===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=====================");
        
        do {System.out.println("\nMasukkan nomor menu yang ingin Anda pesan:");
        int pilihanMenu = sc.nextInt();

        System.out.println("Masukkan jumlah item yang ingin Anda pesan:");
        int banyakItem = sc.nextInt();

        sc.nextLine();

        System.out.println("Apakah ada kode promo? Jika ada, masukkan; jika tidak, ketik 'SKIP':");
        String kodePromo = sc.nextLine();

        int totalHargaPesanan = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalHargaKeseluruhan += totalHargaPesanan;

        System.out.println("Total harga sementara: Rp " + totalHargaKeseluruhan);

       
        System.out.println("Apakah Anda ingin memesan menu lain? (YA/TIDAK):");
        keadaan = sc.nextLine();
    } while (keadaan.equalsIgnoreCase("YA"));
        

       

        System.out.println("Total harga untuk pesanan anda: Rp"+ totalHargaKeseluruhan);
    }
}