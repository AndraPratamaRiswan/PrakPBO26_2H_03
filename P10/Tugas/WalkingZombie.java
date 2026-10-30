package P10.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.10);
                break;
            case 2:
                health += (int) (health * 0.30);
                break;
            case 3:
                health += (int) (health * 0.40);
                break;
            default:
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.20);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth = " + health + "\nLevel = " + level + "\n";
    }
}