package P6Teori.Exercise1;

public class Televisi {
    protected String merek;
    protected int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        channelAktif = 1;
    }

    public void pindahChannel(int newChannel) {
        channelAktif = newChannel;
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
