package P3.Tugas1;

public class EncapDemo {
    private  String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge < 18){
            System.out.println("Umur minimal 18 tahun! \n");
        }
        else if (newAge > 30){
            System.out.println("Umur maksimal 30 tahun! \n");
        }
        else {
            age = newAge;
        }
    }
}
