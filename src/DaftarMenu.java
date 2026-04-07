public class DaftarMenu {
    public static void main(String[] args) {
        boolean keluar = false;
        do {
            System.out.println("Sistem Informasi Menu Makanan di Rumah Makan XY");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.print("Masukkan pilihan anda: ");
            int pilihUtama = BacaKeyboard.bacaInteger();

            if (pilihUtama == 1) {
                System.out.println("Daftar Menu Makanan");
                System.out.println("1) Paket 1: Nasi + Ayam Bakar + Es Teh");
                System.out.println("2) Paket 2: Nasi + Ayam Goreng + Es Teh");
                System.out.println("3) Paket 3: Nasi + Ikan Bakar + Es Teh");
                System.out.println("0) Kembali ke halaman utama");
                System.out.print("Masukkan pilihan anda: ");
                int pilihMakanan = BacaKeyboard.bacaInteger();

                if (pilihMakanan == 1) {
                    System.out.println("Paket 1 yang anda pilih dengan Nasi + Ayam Bakar + Es Teh. Mohon ditunggu!");
                    System.out.print("Ketik 0 untuk pesan lainnya atau ketik 1 untuk keluar: ");
                    int kembali = BacaKeyboard.bacaInteger();
                    if (kembali == 0) {
                        keluar = false;
                    } else if (kembali == 1) {
                        keluar = true;
                    } else {
                        System.out.print("Inputan salah, ketik 0 untuk kembali ke halaman utama: ");
                        int close = BacaKeyboard.bacaInteger();
                        keluar = false;
                    }
                } else if (pilihMakanan == 2) {
                    System.out.println("Paket 2 yang anda pilih dengan Nasi + Ayam Goreng + Es Teh. Mohon ditunggu!");
                    System.out.print("Ketik 0 untuk pesan lainnya atau ketik 1 untuk keluar: ");
                    int kembali = BacaKeyboard.bacaInteger();
                    if (kembali == 0) {
                        keluar = false;
                    } else if (kembali == 1) {
                        keluar = true;
                    } else {
                        System.out.print("Inputan salah, ketik 0 untuk kembali ke halaman utama: ");
                        int close = BacaKeyboard.bacaInteger();
                        keluar = false;
                    }
                } else if (pilihMakanan == 3) {
                    System.out.println("Paket 3 yang anda pilih dengan Nasi + Ikan Bakar + Es Teh. Mohon ditunggu!");
                    System.out.print("Ketik 0 untuk pesan lainnya atau ketik 1 untuk keluar: ");
                    int kembali = BacaKeyboard.bacaInteger();
                    if (kembali == 0) {
                        keluar = false;
                    } else if (kembali == 1) {
                        keluar = true;
                    } else {
                        System.out.print("Inputan salah, ketik 0 untuk kembali ke halaman utama: ");
                        int close = BacaKeyboard.bacaInteger();
                        keluar = false;
                    }
                } else if (pilihMakanan == 0) {
                    keluar = false;
                } else {
                    System.out.print("Maaf inputan salah, silahkan ketik 0 untuk kembali: ");
                    int kembali = BacaKeyboard.bacaInteger();
                    keluar = false;
                }
            } else if (pilihUtama == 2) {
                System.out.print("Menu Belum Tersedia, silahkan ketik 0 untuk kembali: ");
                int kembali = BacaKeyboard.bacaInteger();
                keluar = false;
            } else {
                System.out.print(
                        "Maaf anda salah memasukkan pilihan angka, silahkan menuju ke halaman depan, dengan mengetik angka 0 :");
                int kembali = BacaKeyboard.bacaInteger();
                keluar = false;
            }
        } while (!keluar);
    }
}
