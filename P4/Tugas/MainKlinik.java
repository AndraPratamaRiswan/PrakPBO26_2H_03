package P4.Tugas;

public class MainKlinik {
    public static void main(String[] args) {
        // 1. Uji coba composition (Klinik dan RuangPeriksa)
        Klinik klinik = new Klinik("Klinik Medika Sehat", "Ruang Tulip 03");

        // 2. Uji coba aggregation (Klinik dan Dokter)
        Dokter dokter = new Dokter("dr. Andra", "Spesialis Anak");
        klinik.setDokter(dokter);
        
        klinik.tampilkanInfo();
        System.out.println("-------------------------------------------");

        // 3. Uji coba dependency (Dokter dan Pasien)
        Pasien pasien = new Pasien("Udin", 9);
        dokter.periksaPasien(pasien, "Batuk dan Pilek");
    }
}
