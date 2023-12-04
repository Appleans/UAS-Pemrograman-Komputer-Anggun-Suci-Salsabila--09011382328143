import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkkan jumlah suku Fibanocci yang ingin ditampilkan: ");
    int jumlahsuku = input.nextInt();

    int sukusebelum =0;
    int sukusekarang=1;
    System.out.println("Deret Fibonacci: ");
    for(int i=1; i<= jumlahsuku;++i){
        System.out.println(sukusebelum + " ");
        int jumlahsetelah = sukusebelum + sukusekarang;
        sukusebelum=sukusekarang;
        sukusekarang=jumlahsetelah;
    }
    input.close();
    }
}
