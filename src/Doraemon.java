import java.util.ArrayList;

public class Doraemon {
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("Tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        kantongAjaib.remove("Tikus");

        System.out.println(kantongAjaib);

        System.out.println("Kantong ajaib berisi: " + kantongAjaib.size() + " item");
    }
}
