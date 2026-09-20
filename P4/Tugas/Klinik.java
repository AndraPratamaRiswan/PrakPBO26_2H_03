package P4.Tugas;

public class Klinik {
    private String namaKlinik;
    private RuangPeriksa ruang; // atribut composition
    private Dokter dokter;       // atribut aggregation

    public Klinik(String namaKlinik, String namaRuang) {
        this.namaKlinik = namaKlinik;
        // relasi composition: objek RuangPeriksa dibuat langsung di dalam constructor Klinik
        this.ruang = new RuangPeriksa(namaRuang);
    }

    // relasi aggregation: objek Dokter disuntikkan dari luar via setter
    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public void tampilkanInfo() {
        System.out.println("--- INFO KLINIK ---");
        System.out.println("Klinik          : " + namaKlinik);
        System.out.println("Ruang Praktik   : " + ruang.getNamaRuang());
        if (dokter != null) {
            System.out.println("Dokter Bertugas : " + dokter.getNama());
        } else {
            System.out.println("Dokter Bertugas : Belum Ada");
        }
    }
}
