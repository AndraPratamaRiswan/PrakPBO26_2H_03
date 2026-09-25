package P5;

public class SpaceShuttle {
    private String Kode;
    private int Berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt){
        this.Kode = kd;
        this.Berat = brt;
        this.RoketUtama = rkt;
        this.GeneratorUtama = gnt;
    }

    public void setKode(String kd){
        this.Kode = kd;
    }

    public String getKode(){
        return Kode;
    }

    public void setRoketUtama(Roket rkt){
        this.RoketUtama = rkt;
    }

    public Roket getRoketUtama(){
        return RoketUtama;
    }

    public void setGeneratorUtama(Generator gnt){
        this.GeneratorUtama = gnt;
    }

    public Generator getGeneratorUtama(){
        return GeneratorUtama;
    }

    public void setBerat(int brt){
        this.Berat = brt;
    }

    public int getBerat(){
        return Berat;
    }
}
