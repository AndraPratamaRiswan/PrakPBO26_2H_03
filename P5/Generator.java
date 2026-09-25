package P5;

public class Generator {
    private int Daya;
    private int Voltase;

    public Generator(int dy, int volt){
        this.Daya = dy;
        this.Voltase = volt;
    }

    public void setDaya(int dy){
        this.Daya = dy;
    }

    public int getDaya(){
        return Daya;
    }

    public void setVoltase(int volt){
        this.Voltase = volt;
    }

    public int getVoltase() {
        return Voltase;
    }
}
