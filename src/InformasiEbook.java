import java.util.ArrayList;

public class InformasiEbook {

    static ArrayList<Object> dataBuku = new ArrayList<Object>();
    static int id, tahunTerbit;
    static String judul, penerbit, penulis;

    public static ArrayList<Object> tambahData(int id, String judul, String penerbit, int tahunTerbit, String penulis) {

        dataBuku.add(id);
        dataBuku.add(judul);
        dataBuku.add(penerbit);
        dataBuku.add(tahunTerbit);
        dataBuku.add(penulis);

        return dataBuku;

    }

    public static ArrayList<String> cariData(String judul, String penulis) {
        ArrayList<String> hasil = new ArrayList<>();
        for (int i = 0; i < dataBuku.size(); i += 5) {
            String cariJudul = (String) dataBuku.get(i + 1);
            String cariPenulis = (String) dataBuku.get(i + 4);

            if (judul.equalsIgnoreCase(cariJudul) &&
                    penulis.equalsIgnoreCase(cariPenulis)) {
                hasil.add(dataBuku.get(i).toString());
                hasil.add(dataBuku.get(i + 1).toString());
                hasil.add(dataBuku.get(i + 2).toString());
                hasil.add(dataBuku.get(i + 3).toString());
                hasil.add(dataBuku.get(i + 4).toString());
            }
        }

        return hasil;
    }

}
