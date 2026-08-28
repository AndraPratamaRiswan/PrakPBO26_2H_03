package P1.InheritanceDemo;

public class Gadget {
    private String brand;
    private int ram = 1;
    private int price;

    // ram 4 GB = +500k
    // ram 8 GB = +1jt
    // ram 16 GB = + 2jt
    private final int[] RAM_PRICE ={500000, 1000000, 2000000};
    public void setBrand (String brandName){
        brand = brandName;
    }

    public void setPrice (int newPrice){
        price = newPrice;
    }

    public void ramChoice (int ramValue){
        if (ramValue == 4){
            price += RAM_PRICE[ram - 1];
            ram = 4;
        }
        else if(ramValue == 8){
            price += RAM_PRICE[ram];
            ram = 8;
        }
        else if(ramValue == 16){
            price += RAM_PRICE[ram + 1];
            ram = 16;
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
    
    public void printAll(){
        System.out.println();
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram);
        System.out.println("Price : " + price);
    }
}
