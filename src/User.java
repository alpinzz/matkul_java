import java.util.ArrayList;
import java.util.Scanner;

public class User {

    static String id, username, password, role;
    ArrayList<String> dataUSer = new ArrayList<>();

    void register() {
        System.out.println("Register");
        System.out.println("Silahakan registrasi");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan id: ");
        id = input.nextLine();
        dataUSer.add(id);

        System.out.print("Masukkan username: ");
        username = input.nextLine();
        dataUSer.add(username);

        System.out.print("Masukkan password: ");
        password = input.nextLine();
        dataUSer.add(password);

        System.out.print("Masukkan role (Admin / Pengunjung): ");
        role = input.nextLine();
        dataUSer.add(role);

        // System.out.println(dataUSer);

    }

    void login() {
        String usernameLogin, passwordLogin;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Login");
        System.out.print("Masukkan username: ");
        usernameLogin = input.nextLine();
        System.out.print("Masukkan password: ");
        passwordLogin = input.nextLine();

        if (usernameLogin.equals(username) && passwordLogin.equals(password)) {
            System.out.println("=== Data User ===");
            System.out.println("ID: " + dataUSer.get(0));
            System.out.println("Username: " + dataUSer.get(1));
            System.out.println("Password: " + dataUSer.get(2));
            System.out.println("Role: " + dataUSer.get(3));

            if (role.equalsIgnoreCase("admin")) {
                System.out.println("Selamat datang " + dataUSer.get(3));
            } else {
                System.out.println("Selamat datang " + dataUSer.get(3));
            }
        }

        input.close();
    }

    public static void main(String[] args) {

        User auth = new User();

        auth.register();
        auth.login();

    }
}
