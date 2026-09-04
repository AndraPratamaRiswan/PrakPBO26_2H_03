package Tugas;

public class Peminjaman {
    public int id_peminjaman;
    public String nama_member;
    public String nama_game;
    public int harga_game;
    public int lama_sewa;
    public int total_harga;

    public void tampilDataPeminjam(){
        System.out.println("Data Peminjam      ID : "+id_peminjaman);
        System.out.println("Nama                  : "+nama_member);
        System.out.println("Game yang disewa      : "+nama_game);
        System.out.println("Harga Game            : "+harga_game);
        System.out.println("Lama Sewa             : "+lama_sewa + " hari");
        System.out.println();
        System.out.println("Total Harga           : "+total_harga);
    }

    public int hitungTotalHarga(int lamaSewa){
        total_harga = harga_game * lamaSewa;
        return total_harga;

    }
}
