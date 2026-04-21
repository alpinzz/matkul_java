public class BelajarFungsi {

    static void ucapSalam() {
        System.out.println("Selamat Pagi");
    }

    static void sayHello(String name) {
        System.out.println("Selamat Pagi: " + name);
    }

    static String biodata(String informasi) {
        informasi = "Alfin Hidayat\n" +
                "NIM: 242520001\n" +
                "Kelas: 12 TKJ 1\n" +
                "Alamat: Jl. Raya No.123\n" +
                "Hobi: Membaca Buku\n" +
                "Cita-cita: Software engineer\n" +
                "No Hp: 08123456789\n";

        return informasi;
    }

    public static void main(String[] args) {

        ucapSalam();
        // fungsi dengan parameter
        sayHello("Alfin");
        // fungsi dengan return nilai
        biodata("informasi");

    }
}
