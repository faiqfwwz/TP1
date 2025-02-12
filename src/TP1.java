import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TP1 {

    public static int stok;
    public static double hargaBarang;
    public static double saldo;
    public static LocalDate tanggalHariIni = LocalDate.now();
    public static Locale localeID = new Locale("id", "ID");
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM y", localeID);
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
        stok = input.nextInt();

        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextDouble();

        System.out.print("Masukkan saldo awal: ");
        saldo = input.nextDouble();

        System.out.println("\nPilih menu");
        System.out.println("1. Penjual");
        System.out.println("2. Pembeli");
        System.out.println("3. Hari Selanjutnya");
        System.out.println("4. Keluar");

        while (true){
            System.out.print("\nPerintah : ");
            int pilihanMenuAwal = input.nextInt();
            switch (pilihanMenuAwal){
                case 1:
                    menuPenjual();
                    break;
                case 2:
                    menuPembeli();
                    break;
                case 3:
                    hariSelanjutnya();
                    break;
                case 4:
                    keluar();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    public static void menuPenjual(){
        System.out.println("\n===== MENU PENJUAL =====");
        System.out.println("1. Cek Stok");
        System.out.println("2. Cek Harga Barang");
        System.out.println("3. Tambah Stok");
        System.out.println("4. Ubah Harga Barang");
        System.out.println("5. Generate Voucher");
        System.out.println("6. Kirim Barang");
        System.out.println("7. Lihat Laporan Pendapatan");
        System.out.println("8. Kembali ke menu utama");
        while (true){
            System.out.print("\nPerintah : ");
            int pilihanMenuPenjual = input.nextInt();
            switch (pilihanMenuPenjual){
                case 1:
                    cekStok(stok);
                    break;
                case 2:
                    cekHargaBarang(hargaBarang);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
                    int tambahan = input.nextInt();
                    tambahStok(stok, tambahan);
                    break;
                case 4:
                    System.out.print("Masukkan harga barang yang baru: ");
                    double hargaBarangBaru = input.nextInt();
                    ubahHargaBarang(hargaBarangBaru);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

    }

    public static void menuPembeli(){
        System.out.println("\n===== MENU PEMBELI =====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Cek Harga Barang");
        System.out.println("4. Beli Barang");
        System.out.println("5. Generate Voucher");
        System.out.println("6. Lacak Barang");
        System.out.println("7. Lihat Laporan Pengeluaran");
        System.out.println("8. Kembali ke menu utama");
        while (true){
            System.out.print("\nPerintah : ");
            int pilihanMenuPembeli = input.nextInt();
            switch (pilihanMenuPembeli){
                case 1:
                    cekSaldo(saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah saldo yang ingin ditambah: ");
                    int tambahan = input.nextInt();
                    topUpSaldo(saldo, tambahan);
                    break;
                case 3:
                    cekHargaBarang(hargaBarang);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    public static void hariSelanjutnya(){
        // Tambah satu hari ke tanggalHariIni
        tanggalHariIni = tanggalHariIni.plusDays(1);

        // Cetak tanggal menggunakan formatter yang sudah di-import dan diinisialisasi di atas
        System.out.println("Tanggal: " + tanggalHariIni.format(formatter));
    }

    public static void keluar(){
        System.out.println("""
                ===========================================
                Terima kasih telah menggunakan Burhanpedia!
                ===========================================
                """);
    }

    public static void cekStok(int stok){
        System.out.println("==============================");
        System.out.println("Stok saat ini: " + stok);
        System.out.println("==============================");
    }

    public static void cekHargaBarang(double hargaBarang){
        System.out.println("==============================");
        System.out.println("Harga barang saat ini: " + hargaBarang);
        System.out.println("==============================");
    }

    public static void tambahStok(int stok, int tambahan){
        if (tambahan <= 0) {
            System.out.println("Nominal tidak valid!");
        } else {
            stok += tambahan;
            System.out.println("Stok berhasil ditambah! Stok saat ini: " + stok);
        }
    }

    public static void ubahHargaBarang(double hargaBarangBaru){
        if (hargaBarangBaru <= 0) {
            System.out.println("Nominal tidak valid!");
        } else {
            hargaBarang = hargaBarangBaru;
            System.out.printf("Harga barang saat ini: %.2f%n", hargaBarang);
        }
    }

    public static void cekSaldo(double saldo){
        System.out.println("==============================");
        System.out.println("Saldo saat ini: " + saldo);
        System.out.println("==============================");
    }

    public static void topUpSaldo(double saldo, int tambahan){
        if (tambahan <= 0) {
            System.out.println("Nominal tidak valid!");
        } else {
            saldo += tambahan;
            System.out.printf("Saldo berhasil ditambah! Saldo saat ini: %.2f%n", saldo);
        }
    }




//        // Contoh penggunaan method tambahStok dalam konteks menu
//        System.out.print("Masukkan jumlah stok yang ingin ditambah: ");
//        int tambahan = input.nextInt();

//        try {
//            int stokBaru = tambahStok(stokSaatIni, tambahan);
//            System.out.println("Stok berhasil ditambah! Stok saat ini: " + stokBaru);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


//    /**
//     * Method ini menambahkan jumlah stok baru ke stok saat ini.
//     * Jika jumlah tambahan kurang dari atau sama dengan 0, maka method akan melempar IllegalArgumentException.
//     *
//     * @param stokSaatIni stok barang yang tersedia saat ini
//     * @param tambahan jumlah stok yang ingin ditambahkan; harus lebih besar dari 0
//     * @return stok barang yang baru setelah penambahan
//     * @throws IllegalArgumentException jika parameter tambahan tidak valid (<= 0)
//     */
//    public static int tambahStok(int stokSaatIni, int tambahan) {
//        if (tambahan <= 0) {
//            throw new IllegalArgumentException("Nominal tidak valid!");
//        }
//        return stokSaatIni + tambahan;
//    }
}
