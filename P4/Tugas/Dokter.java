package P4.Tugas;

public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama() {
        return nama;
    }

    // relasi dependency: Pasien hanya hadir sebagai parameter metode
    public void periksaPasien(Pasien pasien, String diagnosa) {
        System.out.println("Dokter " + nama + " (" + spesialis + ") memeriksa pasien " + pasien.getNama() + " (" + pasien.getUmur() + " thn).");
        System.out.println("Hasil Diagnosa: " + diagnosa);
    }
}
