import java.io.*;

public class BacaKeyboard {
    public static String bacaString() {
        int karakter;
        String str = "";
        boolean selesai = false;

        while (selesai == false) {
            try {
                karakter = System.in.read();
                if (karakter < 0 || (char) karakter == '\n') {
                    selesai = true;
                } else if ((char) karakter != '\r') {
                    str = str + (char) karakter;
                }
            } catch (IOException e) {
                System.err.println("Ada kesalahan input data");
                selesai = true;
            }
        }
        return str;
    }

    public static int bacaInteger() {
        String str = bacaString();
        Integer i = new Integer(str);
        return i.intValue();
    }
}
