public class ArrayDuaDimensi {
    public static void main(String[] args) {
        String[][] kontak = { { "Lili", "0811" }, { "Lala", "0812" }, { "Naya", "0813" } };

        for (int x = 0; x < kontak.length; x++) {
            System.out.println("Nama " + kontak[x][0]);
            System.out.println("Nama " + kontak[x][1]);
            System.out.println("===================");
        }
    }
}
