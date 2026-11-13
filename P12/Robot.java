package P12;

public class Robot extends Karakter{
    public int armor;

    public Robot(String nama, int armor){
        this.nama = nama;
        this.armor = armor;
    }

    @Override 
    public void hancurkan (DestroyAble da){
        // da.hancur();
        // System.out.print(" Oleh " + nama + "\n");
        if(da instanceof Gedung){
            System.out.println("Gedung telah dihancurkan! Oleh Macross");
        }
        else if (da instanceof Tiang){
            System.out.println("Tiang telah dihancurkan! Oleh Macross");
        } 
    }
}
