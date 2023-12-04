import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) throws Exception {
    String usernamebenar = "Anggun Suci Salsabila";
    String passwordbenar = "250325";

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan username: ");
    String username = input.nextLine();
    System.out.println("Masukkan Password: ");
    String password = input.nextLine();

    if(username.equals(usernamebenar)&& password.equals(passwordbenar)){
        System.out.println("Autentikasi Berhasil!");
    } else{
         System.out.println("Autentikasi Gagal!");
    }

    input.close();
    }
}
