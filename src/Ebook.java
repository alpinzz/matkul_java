import java.util.Scanner;

public class Ebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEM INFORMASI EBOOK");
        System.out.println("=======================");

        System.out.print("Masukkan ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan judul: ");
        String judul = input.nextLine();

        System.out.print("Masukkan penulis: ");
        String penulis = input.nextLine();

        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan penerbit: ");
        String penerbit = input.nextLine();

        System.out.println(InformasiEbook.tambahData(id, judul, penulis, tahunTerbit, penerbit));

        System.out.println("Cari Data");

        System.out.print("Masukkan judul ebook: ");
        String cariJudul = input.nextLine();

        System.out.print("Masukkan penulis ebook: ");
        String cariPenulis = input.nextLine();

        InformasiEbook.cariData(cariJudul, cariPenulis);

        input.close();
    }
}
