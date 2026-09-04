package Tugas3;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "1D";
        brg1.namaBarang = "Sabun Cuci";
        brg1.hargaDasar = 12000;
        brg1.diskon = 10;

        brg1.tampilData();
        
    }

}
