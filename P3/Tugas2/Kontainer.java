package P3.Tugas2;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private int kapasitasMaksimal;
    private int beratMuatanSaatIni;

    Kontainer (String newResi, String newNama, int newMaks){
        nomorResi = newResi;
        namaPemilik = newNama;
        kapasitasMaksimal = newMaks;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }

    public int getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }

    public int getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(int newMuatan){
        if (beratMuatanSaatIni+newMuatan > kapasitasMaksimal){
            System.out.println("Beban muatan melebihi batas!");
        }
        else{
            beratMuatanSaatIni+=newMuatan;
        }
    }

    public void turunkanMuatan(int kurangBerat){
        if (beratMuatanSaatIni-kurangBerat < 0){
            System.out.println("Muatan saat ini hanya "+getBeratMuatanSaatIni());
        }
        else if(kurangBerat > beratMuatanSaatIni/2){
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        }
        else{
            beratMuatanSaatIni -= kurangBerat;
        }
    }

}
