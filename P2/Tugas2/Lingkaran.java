package Tugas2;

public class Lingkaran {
    public double phi = Math.PI;
    public double r;

    public double hitungLuas(){
        return phi * (r*r);
    }

    public double hitungKeliling(){
        return 2 * phi * r;
    }
}
