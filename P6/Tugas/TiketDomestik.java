package P6.Tugas;

public class TiketDomestik extends TiketPesawat {
    protected int pajakBandara;

    public TiketDomestik() {
    }

    public TiketDomestik(TiketPesawat tiketPesawat, int pajakBandara) {
        super(tiketPesawat);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        super.tampilPesawat();

        System.out.println("Pajak Bandara   = " + pajakBandara);

        int totalBayar = hargaDasar
                + hitungBiayaBagasi()
                + pajakBandara;

        System.out.println("Total Bayar     = " + totalBayar);
    }
}
