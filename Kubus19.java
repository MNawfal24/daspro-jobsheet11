import java.util.Scanner;
public class Kubus19 {
    static int hitungLuas(int sisi) {
        int L = (sisi * sisi) * 6;
        return L;
    }
    static int hitungVol(int sisi) {
        int vol = sisi*sisi*sisi;
        return vol ;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Masukkan panjang sisi dari kubus");
        int sisi = sc.nextInt();

        int vol = hitungVol(sisi);
        System.out.println(" Volume kubus adalah " + vol);
        
        int L = hitungLuas(sisi);
        System.out.println("Luas kubus adalah " + L);
    }
}