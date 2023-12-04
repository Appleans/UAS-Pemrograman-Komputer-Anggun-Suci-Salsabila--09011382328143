import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double a, b;
        double hasil =0;
        System.out.println("Masukkan angka pertama: ");
        a=input.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        b=input.nextDouble();
        System.out.println("PILIH OPERASI APA YANG INGIN DILAKUKAN!");
        System.out.println("1.Penjumlahan (+)");
        System.out.println("2.Pengurangan (-)");
        System.out.println("3.Perkalian (*)");
        System.out.println("4.Pembagian(/)");
        System.out.println("5.Modulus (%)");
        System.out.println("Masukkan nomor operasi: ");
        int pilihan=input.nextInt();
        switch (pilihan) {
            case 1:
                hasil = a+b;
                break;
            case 2:
                hasil=a-b;
                break;
             case 3:
                hasil=a*b;
                break;
             case 4:
             if (b !=0) {
                hasil=a/b;
             }else{
                System.out.println("Error");
             }
                
                break;
             case 5:
                hasil=a%b;
                break;
            default:
             System.out.println("Pilihan anda tidak valid!");
                return;
        }
        System.out.println("Hasil: "+ hasil); 
        
        input.close(); 
    }
}
