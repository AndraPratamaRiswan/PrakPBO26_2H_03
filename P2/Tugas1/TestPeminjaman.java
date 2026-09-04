package Tugas1;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjmn1 = new Peminjaman();
        pjmn1.id_peminjaman = 111;
        pjmn1.nama_member = "Andra";
        pjmn1.nama_game = "Tahu Bulat Simulator";
        pjmn1.harga_game = 5000;
        pjmn1.lama_sewa = 5;
        pjmn1.hitungTotalHarga(pjmn1.lama_sewa);
        pjmn1.tampilDataPeminjam();
        
    }
}
