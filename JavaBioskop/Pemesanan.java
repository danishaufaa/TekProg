public class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(Pelanggan pelanggan, Tiket tiket, int jumlah) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public Pelanggan getPelanggan() { return pelanggan; }
    public void setPelanggan(Pelanggan pelanggan) { this.pelanggan = pelanggan; }
    public Tiket getTiket() { return tiket; }
    public void setTiket(Tiket tiket) { this.tiket = tiket; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    public void tampilkanDetailPemesanan() {
        System.out.println("Pemesanan Tiket");
        System.out.println("Pelanggan: " + pelanggan.getNama() + " (" + pelanggan.getEmail() + ")");
        System.out.println("Film: " + tiket.getFilm().getJudul() + " (" + tiket.getFilm().getGenre() + ")");
        System.out.println("Durasi: " + tiket.getFilm().getDurasi() + " menit");
        System.out.println("Jadwal: " + tiket.getJadwal());
        System.out.println("Harga per Tiket: Rp " + tiket.getHarga());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Bayar: Rp " + (tiket.getHarga() * jumlah));
    }
}