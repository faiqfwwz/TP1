import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TP1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");

        System.out.print("Masukkan stok awal: ");
        int stokSaatIni = scanner.nextInt();

        // Contoh penggunaan method tambahStok dalam konteks menu
        System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
        int tambahan = scanner.nextInt();

        try {
            int stokBaru = tambahStok(stokSaatIni, tambahan);
            System.out.println("Stok berhasil ditambah! Stok saat ini: " + stokBaru);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // ... kode menu dan opsi lainnya dapat dilanjutkan di sini.
    }

    /**
     * Method ini menambahkan jumlah stok baru ke stok saat ini.
     * Jika jumlah tambahan kurang dari atau sama dengan 0, maka method akan melempar IllegalArgumentException.
     *
     * @param stokSaatIni stok barang yang tersedia saat ini
     * @param tambahan jumlah stok yang ingin ditambahkan; harus lebih besar dari 0
     * @return stok barang yang baru setelah penambahan
     * @throws IllegalArgumentException jika parameter tambahan tidak valid (<= 0)
     */
    public static int tambahStok(int stokSaatIni, int tambahan) {
        if (tambahan <= 0) {
            throw new IllegalArgumentException("Nominal tidak valid!");
        }
        return stokSaatIni + tambahan;
    }
}
