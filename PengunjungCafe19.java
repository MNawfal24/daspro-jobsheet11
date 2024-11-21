    public class PengunjungCafe19{
        public static void daftarPengunjung(int umur, String... namaPengunjung){
        System.out.println(" Daftar Nama Pengunjung : ");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
        System.out.println("Usia Pengunjung adalah: " + umur);
    }

    public static void main(String[] args) {
        daftarPengunjung(19, "Ali", "Budi", "Citra");
    }
}
    