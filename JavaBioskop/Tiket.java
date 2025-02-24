public class Tiket {
    private Film film;
    private String jadwal;
    private double harga;

    public Tiket(Film film, String jadwal, double harga) {
        this.film = film;
        this.jadwal = jadwal;
        this.harga = harga;
    }

    public Film getFilm() { return film; }
    public void setFilm(Film film) { this.film = film; }
    public String getJadwal() { return jadwal; }
    public void setJadwal(String jadwal) { this.jadwal = jadwal; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}
