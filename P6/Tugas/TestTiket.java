package P6.Tugas;

public class TestTiket {
    
    public static void main(String[] args) {

       
        Tiket tiket1 = new Tiket();
        tiket1.kodeTiket = "KA-001";
        tiket1.namaPenumpang = "Andi";
        tiket1.asal = "Malang";
        tiket1.tujuan = "Jakarta";
        tiket1.hargaDasar = 350000;

        TiketKereta tiketKereta = new TiketKereta();
        tiketKereta.kodeTiket = tiket1.kodeTiket;
        tiketKereta.namaPenumpang = tiket1.namaPenumpang;
        tiketKereta.asal = tiket1.asal;
        tiketKereta.tujuan = tiket1.tujuan;
        tiketKereta.hargaDasar = tiket1.hargaDasar;
        tiketKereta.nomorGerbong = 3;
        tiketKereta.nomorKursi = "12A";

        System.out.println("============ Tiket Kereta ============");
        tiketKereta.tampilKereta();

        
        Tiket tiket2 = new Tiket();
        tiket2.kodeTiket = "GA-102";
        tiket2.namaPenumpang = "Sinta";
        tiket2.asal = "Surabaya";
        tiket2.tujuan = "Denpasar";
        tiket2.hargaDasar = 900000;

        TiketPesawat tiketPesawat = new TiketPesawat();
        tiketPesawat.kodeTiket = tiket2.kodeTiket;
        tiketPesawat.namaPenumpang = tiket2.namaPenumpang;
        tiketPesawat.asal = tiket2.asal;
        tiketPesawat.tujuan = tiket2.tujuan;
        tiketPesawat.hargaDasar = tiket2.hargaDasar;
        tiketPesawat.maskapai = "Garuda Indonesia";
        tiketPesawat.beratBagasi = 25;

        TiketDomestik tiketDomestik =
                new TiketDomestik(tiketPesawat, 75000);

        System.out.println("====== Tiket Pesawat Domestik ======");
        tiketDomestik.tampilDomestik();

        
        Tiket tiket3 = new Tiket();
        tiket3.kodeTiket = "SQ-205";
        tiket3.namaPenumpang = "Budi";
        tiket3.asal = "Jakarta";
        tiket3.tujuan = "Singapura";
        tiket3.hargaDasar = 2500000;

        TiketPesawat tiketPesawat2 = new TiketPesawat();
        tiketPesawat2.kodeTiket = tiket3.kodeTiket;
        tiketPesawat2.namaPenumpang = tiket3.namaPenumpang;
        tiketPesawat2.asal = tiket3.asal;
        tiketPesawat2.tujuan = tiket3.tujuan;
        tiketPesawat2.hargaDasar = tiket3.hargaDasar;
        tiketPesawat2.maskapai = "Singapore Airlines";
        tiketPesawat2.beratBagasi = 20;

        TiketInternasional tiketInternasional =
                new TiketInternasional(
                        tiketPesawat2,
                        "C1234567",
                        150000
                );

        System.out.println("===== Tiket Pesawat Internasional =====");
        tiketInternasional.tampilInternasional();
    }
}
