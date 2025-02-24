public class BioskopMain {
    public static void main(String[] args) {
        Film film1 = new Film("Sekawan Limo", "Horror", 151);
        Pelanggan pelanggan1 = new Pelanggan("Aufa", "aufa@gmail.com");
        Tiket tiket1 = new Tiket(film1, "20:00 WIB", 45000);
        Pemesanan pemesanan1 = new Pemesanan(pelanggan1, tiket1, 2);
        
        pemesanan1.tampilkanDetailPemesanan();
    }
}
