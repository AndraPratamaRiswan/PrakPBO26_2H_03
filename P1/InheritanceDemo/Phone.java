package P1.InheritanceDemo;

public class Phone extends Gadget {
    private int cam;

    public void setPixel (int pixel){
        cam = pixel;
    }
    
    @Override
    public void printAll(){
        super.printAll();
        System.out.println("Camera : " + cam + " MP");
        System.out.println("Type : Phone");
    }
}
