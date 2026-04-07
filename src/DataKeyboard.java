public class DataKeyboard {
    public static void main(String[] args) {
        System.out.print("Masukkan nama anda: ");
        String nama = BacaKeyboard.bacaString();
        System.out.print("Masukkan umur anda: ");
        int umur = BacaKeyboard.bacaInteger();

        if (umur < 17) {
            System.out.println("Anda masih anak-anak");
        } else {
            System.out.println("Anda sudah dewasa");
        }
    }
}
