public class soal8 {
    public static void main(String[] args) {
        AkunPengguna akun = new AkunPengguna("Anggun", "250325");

        akun.tampilkanInfoAkun();

        akun.aktifkanAkun();
        akun.tampilkanInfoAkun();

        akun.nonaktifkanAkun();
        akun.tampilkanInfoAkun();
    }
}

class AkunPengguna {
    private String username;
    private String password;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false; // Awalnya akun tidak aktif
    }

    public void tampilkanInfoAkun() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun berhasil diaktifkan.");
    }

    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun berhasil dinonaktifkan.");

    }
}
