import java.util.ArrayList;

public class InformasiEbook {
    static ArrayList<ArrayList<Object>> dataEbook = new ArrayList<>();

    public static ArrayList<Object> tambahData(int id, String judul, String penulis, int tahunTerbit, String penerbit) {
        ArrayList<Object> ebook = new ArrayList<>();

        ebook.add(id);
        ebook.add(judul);
        ebook.add(penulis);
        ebook.add(tahunTerbit);
        ebook.add(penerbit);

        dataEbook.add(ebook);

        return ebook;
    }

    public static void cariData(String judul, String penulis) {
        for (ArrayList<Object> ebook : dataEbook) {
            String judulEbook = (String) ebook.get(1);
            String penulisEbook = (String) ebook.get(2);

            if (judulEbook.equalsIgnoreCase(judul) && penulisEbook.equalsIgnoreCase(penulis)) {
                System.out.println("Data ditemukan");
            }
        }
    }
}
