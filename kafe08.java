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
        System.out.println("Silahkan pilih menu yang ingin dipesan (1-6):"); }
    
        public static int hitungTotalHarga08(int pilihanMenu, int banyakItem) {
        int[] hargaItem = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = total * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = total * 30 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            diskon = diskon + (total * 10 / 100);
        }

        return diskon;
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

        int totalHarga = 0;
        String pesanLagi;
        do {
            System.out.print("Pilihan menu (1-6): ");
            int pilihanMenu = input.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Banyak item: ");
                int banyakItem = input.nextInt();
                totalHarga = totalHarga + hitungTotalHarga08(pilihanMenu, banyakItem);
            }

            System.out.print("Pesan menu lain? (y/n): ");
            pesanLagi = input.next();
        } while (pesanLagi.equalsIgnoreCase("y"));

        System.out.print("Masukkan kode promo: ");
        String kodePromo = input.next();

        int diskon = hitungDiskon(totalHarga, kodePromo, isMember);
        int totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp" + totalHarga);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total bayar : Rp" + totalBayar);

        input.close();

    }
}