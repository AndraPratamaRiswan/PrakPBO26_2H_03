package P7.Tugas.Tugas1;


public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total sudut: " + s.totalSudut(60));
        System.out.println("Sudut ketiga: " + s.totalSudut(60, 70));
        System.out.println("Keliling segitiga: " + s.keliling(3, 4, 5));
        System.out.println("Keliling segitiga siku-siku: " + s.keliling(3, 4));
    }
}