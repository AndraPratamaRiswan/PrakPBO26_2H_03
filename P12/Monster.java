package P12;

public class Monster extends Karakter {
    public int tenaga;

    public Monster(String nama, int tenaga){
        this.nama = nama;
        this.tenaga = tenaga;
    }

    @Override 
    public void hancurkan (DestroyAble da){
        // da.hancur();
        // System.out.print(" Oleh " + nama + "\n");
        if(da instanceof Gedung){
            System.out.println("Gedung telah dihancurkan! Oleh Monster");
        }
        else if (da instanceof Tiang){
            System.out.println("Tiang telah dihancurkan! Oleh Monster");
        }
    }
}
