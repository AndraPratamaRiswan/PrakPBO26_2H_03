package P10.Tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength = (int) (strength * 0.90);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}