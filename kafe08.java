import java.util.Scanner;
public class kafe08 {
    public static void menu(String namaPelangaan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelangaan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pesanan!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Selamat! Anda mendapatkan promo Happy Hour! Diskon 20% untuk semua minuman.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - 15.000");
        System.out.println("2. Cappuccino - 20.000");
        System.out.println("3. Latte - 22.000");
        System.out.println("4. Teh Tarik - 12.000");
        System.out.println("5. Roti Bakar - 10.000");
        System.out.println("6. Mie Goreng - 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang ingin dipesan (1-6):");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Apakah Anda member? (y/n): ");
        String status = input.nextLine();
        boolean isMember = status.equalsIgnoreCase("y");

        System.out.print("Masukkan jam kunjungan (1-24): ");
        int jamKunjung = input.nextInt();

        menu(namaPelanggan, isMember, jamKunjung);
    
        input.close();
    }
}
