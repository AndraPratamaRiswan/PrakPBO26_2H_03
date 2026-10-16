package UTS;

public class PatrolRobot extends Robot {
    public Battery RobotBattery;

    public PatrolRobot (String Name, int cpuspeed, int power, Battery battery){
        this.Name = "PATROL 03 " + Name;
        this.CPUSpeed = cpuspeed;
        this.Power = power;
        this.RobotBattery = battery;
    }

    public void increasePower(){
        super.Power += 20;
    }
}
