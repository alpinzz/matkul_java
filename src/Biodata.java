public class Biodata {
    public static void main(String[] args) {
        final int nim = 242520001;
        String namaLengkap, tanggalLahir;
        namaLengkap = "Alfin Hidayat";
        tanggalLahir = "17 November 2005";
        int tahunLahir, tahunSekarang, usia;
        tahunLahir = 2005;
        tahunSekarang = 2026;
        usia = tahunSekarang - tahunLahir;

        System.out.println("NIM: " + nim);
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Usia: " + usia);

    }
}
