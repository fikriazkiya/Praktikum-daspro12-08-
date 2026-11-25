public class kafe08 {
    public static void menu(String namaPelangaan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelangaan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pesanan!");
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
        menu("budi", false);
    }
}
