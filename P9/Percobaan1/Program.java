package P9.Percobaan1;

public class Program {
    public static void main(String[] args) {

        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        Hewan hewan = new Hewan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
