package P12;

public class TestQuiz {
    public static void main(String[] args) {
        Monster mon = new Monster ("T-Rex", 100);
        Robot rbt = new Robot("Macross", 90);

        mon.hancurkan(new Gedung());
        rbt.hancurkan(new Tiang());
    }
}
