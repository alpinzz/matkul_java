import java.util.ArrayList;
import java.util.Scanner;

public class SistemInformasiPerpustakaan {
    public static void main(String[] args) {
        System.out.println("Sistem Informasi Perpustakaan");
        System.out.println("Silahkan registrasi terlebih dahulu");

        ArrayList data = new ArrayList();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan judul buku: ");
        data.add(input.nextLine());
        System.out.print("Masukkan Penerbit: ");
        data.add(input.nextLine());
        System.out.print("Masukkan Tanggal Penerbit (yyy-MM--dd): ");
        data.add(input.nextLine());
        System.out.print("Masukkan Alamat Penerbit: ");
        data.add(input.nextLine());
        System.out.print("Masukkan No ISSBN: ");
        data.add(input.nextLine());
        System.out.println("Data berhasil disimpan!");
        System.out.println("=================");

        for (int i = 0; i < data.size(); i += 5) {
            System.out.println("Judul Buku: " + data.get(i));
            System.out.println("Penerbit: " + data.get(i + 1));
            System.out.println("Tanggal Terbit: " + data.get(i + 2));
            System.out.println("Alamat Terbit: " + data.get(i + 3));
            System.out.println("No ISSBN: " + data.get(i + 4));
        }
        input.close();
    }
}
