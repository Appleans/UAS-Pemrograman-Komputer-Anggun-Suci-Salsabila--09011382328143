import java.util.Scanner;
class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku (String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }
    
    public void tampilkanInformasi() {
        System.out.println("");
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status: Sedang Dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    public void pinjamBuku() {
        if (dipinjam) {
            System.out.println("Buku ini sudah dipinjam.");
        } else {
            dipinjam = true;
            System.out.println("Anda berhasil meminjam buku " + judul);
        }
    }

    public String getJudul() {
        return judul;
    }
}

public class soal7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buku buku1 = new Buku ("Hujan", "Tere Liye", 2016);
        buku1.tampilkanInformasi();
        buku1.pinjamBuku();
        buku1.tampilkanInformasi();

        input.close();
    }
}
