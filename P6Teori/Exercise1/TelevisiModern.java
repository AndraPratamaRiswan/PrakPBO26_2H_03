package P6Teori.Exercise1;

public class TelevisiModern extends Televisi{
    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount) {
        super();
        merek = mrk;
        jumlahChannel = channelCount;
        dvd = "";
    }

    public void gantiModusTampilan(String mode) {
        displayMode = mode;
    }

    public void mainkanDVD() {
        if (dvd.equals("")) {
            System.out.println("Sedang memainkan DVD: kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + dvd);
        }
    }

    public void masukkanDVD(String dvdTitle) {
        dvd = dvdTitle;
    }
}
