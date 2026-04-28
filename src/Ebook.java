import java.util.Scanner;

public class Ebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Informasi Ebook");
        System.out.println("Tambah Ebook");
        System.out.println("=====================");

        System.out.print("Masukkan id ebook: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan judul ebook: ");
        String judul = input.nextLine();

        System.out.print("Masukkan penerbit ebook: ");
        String penerbit = input.nextLine();

        System.out.print("Masukkan tahun terbit ebook: ");
        int tahunTerbit = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan penulis ebook: ");
        String penulis = input.nextLine();

        for (Object buku : InformasiEbook.tambahData(id, judul, judul, tahunTerbit, penulis)) {
            System.out.println(buku);
        }

        System.out.println("===========");
        System.out.println("Cari Data");
        System.out.print("Masukkan penulis: ");
        String penulisEbook = input.nextLine();
        System.out.print("Masukkan judul: ");
        String judulBuku = input.nextLine();
        System.out.println(InformasiEbook.cariData(judul, penulis));

    }
}
