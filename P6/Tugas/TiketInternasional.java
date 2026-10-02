package P6.Tugas;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(TiketPesawat tiketPesawat,
                              String nomorPaspor, int asuransi) {
        super(tiketPesawat);

        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        super.tampilPesawat();

        System.out.println("Nomor Paspor    = " + nomorPaspor);
        System.out.println("Asuransi        = " + asuransi);

        int totalBayar = hargaDasar
                + hitungBiayaBagasi()
                + asuransi;

        System.out.println("Total Bayar     = " + totalBayar);
    }
}
