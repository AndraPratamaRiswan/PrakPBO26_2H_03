package P3.Tugas3;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    Tiket(String newJudul, double newHarga){
        judulFilm = newJudul;
        if (hargaDasar < 0){
            hargaDasar = 35000;
        }
        hargaDasar = newHarga;
        statusPembayaran = false;
    }

    public String getJudulFilm(){
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public boolean isStatusPembayaran(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
        statusPembayaran = true;
    }
}
