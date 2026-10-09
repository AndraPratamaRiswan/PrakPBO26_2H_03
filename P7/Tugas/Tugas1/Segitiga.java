package P7.Tugas.Tugas1;


public class Segitiga {
    private int sudut;

    // Overloading menghitung total sudut segitiga
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Overloading menghitung sudut ketiga
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloading menghitung keliling segitiga dengan 3 sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading menghitung keliling segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        return sisiA + sisiB
                + Math.sqrt((double) sisiA * sisiA + (double) sisiB * sisiB);
    }
}

