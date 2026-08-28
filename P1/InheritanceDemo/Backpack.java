package P1.InheritanceDemo;

public class Backpack {
    private String brand;
    private String color;

    public void setBrand (String newBrand){
        brand = newBrand;
    }

    public void setColor (String newColor){
        color = newColor;
    }

    public void printInfo(){
        System.out.println();
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
    }
}
