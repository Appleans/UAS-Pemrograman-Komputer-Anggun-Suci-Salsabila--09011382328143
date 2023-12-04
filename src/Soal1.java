import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkkan jumlah barang: ");
    int jumlahbarang = input.nextInt();
    System.out.println("Masukkkan harga barang: ");
    int hargabarang =  input.nextInt();
    double totalharga;
    double diskon;
    if (jumlahbarang < 5) {
        totalharga=jumlahbarang*hargabarang;
    }
    else if(jumlahbarang>=5 && jumlahbarang <=10){
        diskon=0.05;
        totalharga=(jumlahbarang*hargabarang)*(1-diskon);
    }
    else if(jumlahbarang >=11 && jumlahbarang <=20 ){
        diskon = 0.1;
        totalharga=(jumlahbarang*hargabarang)*(1-diskon);
    }
    else {
        diskon = 0.2;
        totalharga=(jumlahbarang*hargabarang)*(1-diskon);
    }
    System.out.println("Total Harga yang harus dibayar: " + totalharga);
    input.close();
    }
}
