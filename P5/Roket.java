package P5;

public class Roket {
    private String Tipe;
    private int Power;

    public Roket (String tipe, int power){
        this.Tipe = tipe;
        this.Power = power;
    }

    public void setPower(int pwr){
        this.Power = pwr;
    }

    public int getPower(){
        return Power;
    }

    public void setTipe(String tp){
        this.Tipe = tp;
    }

    public String getTipe(){
        return Tipe;
    }
}
