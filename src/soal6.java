import java.util.Scanner;
public class soal6 {
    private static boolean isPalindrom(String kata) {
        kata = kata.replaceAll("\\s+", "").toLowerCase(); 

        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String inputKata = input.nextLine();

        if (isPalindrom(inputKata)) {
            System.out.println("Kata ini palindrom.");
        } else {
            System.out.println("Kata ini bukan palindrom.");
        }
        input.close();
    }
}
