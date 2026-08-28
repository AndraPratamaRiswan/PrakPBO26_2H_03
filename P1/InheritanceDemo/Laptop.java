package P1.InheritanceDemo;

public class Laptop extends Gadget{
    private int size;

    public void setSize (int width){
        size = width;
    }
    
    @Override
    public void printAll(){
        super.printAll();
        System.out.println("Screen : " + size + " inch");
        System.out.println("Type : Laptop");
    }
}
