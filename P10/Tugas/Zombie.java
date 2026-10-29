package P10.Tugas;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    protected abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Zombie Data =\nHealth = " + health + "\nLevel = " + level + "\n";
    }
}