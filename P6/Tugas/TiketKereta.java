package P6.Tugas;

public class TiketKereta extends Tiket {
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta() {
    }

    public TiketKereta(Tiket tiket, int nomorGerbong, String nomorKursi) {
        super(
            tiket.kodeTiket,
            tiket.namaPenumpang,
            tiket.asal,
            tiket.tujuan,
            tiket.hargaDasar
        );

        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {
        super.tampilTiket();

        System.out.println("Nomor Gerbong   = " + nomorGerbong);
        System.out.println("Nomor Kursi     = " + nomorKursi);
        System.out.println("Total Bayar     = " + hargaDasar);
    }
}
