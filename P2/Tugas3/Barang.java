package Tugas3;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual(){
        return (int)(hargaDasar-(hargaDasar * (diskon/100)));
    }

    void tampilData(){
        System.out.println("Kode            : "+kode);
        System.out.println("Nama Barang     : "+namaBarang);
        System.out.println("Harga Dasar     : RP."+hargaDasar);
        System.out.println("Diskon          : "+diskon + "%");
        System.out.println("Harga Diskon    : RP."+hitungHargaJual());

    }
}
