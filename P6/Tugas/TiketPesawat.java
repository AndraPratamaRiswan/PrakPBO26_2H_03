package P6.Tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(Tiket tiket, String maskapai, int beratBagasi) {
        super(
            tiket.kodeTiket,
            tiket.namaPenumpang,
            tiket.asal,
            tiket.tujuan,
            tiket.getHargaDasar()

        );

        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public TiketPesawat(TiketPesawat tiket) {
        super(
            tiket.kodeTiket,
            tiket.namaPenumpang,
            tiket.asal,
            tiket.tujuan,
            tiket.getHargaDasar()

        );

        this.maskapai = tiket.maskapai;
        this.beratBagasi = tiket.beratBagasi;
    }

    public int hitungBiayaBagasi() {
        if (beratBagasi > 20) {
            return (beratBagasi - 20) * 50000;
        }

        return 0;
    }

    public void tampilPesawat() {
        super.tampilTiket();

        System.out.println("Maskapai        = " + maskapai);
        System.out.println("Berat Bagasi    = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi    = " + hitungBiayaBagasi());
    }
}
