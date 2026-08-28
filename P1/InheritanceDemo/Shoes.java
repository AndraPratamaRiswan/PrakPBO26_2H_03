package P1.InheritanceDemo;

public class Shoes {
    private String brand;
    private String type;

    public void setBrand (String newBrand){
        brand = newBrand;
    }

    public void setType (String newType){
        type = newType;
    }

    public void printInfo(){
        System.out.println();
        System.out.println("Brand : " + brand);
        System.out.println("Type : " + type);
    }
}
