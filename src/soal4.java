import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        System.out.print("Faktorisasi dari bilangan " + bilangan + ": ");

        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;
                if (bilangan != 1) {
                    System.out.print(" * ");
                }
            }
        }

        input.close();
    }
}
