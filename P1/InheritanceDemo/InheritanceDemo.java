package P1.InheritanceDemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        Gadget gadget1 = new Gadget();
        Gadget gadget2 = new Gadget();
        Laptop laptop1 = new Laptop();
        Phone phone1 = new Phone();
        Backpack backpack1 = new Backpack();
        Shoes shoes1 = new Shoes();

        gadget1.setBrand("Asus");
        gadget1.setPrice(5000000);
        gadget1.ramChoice(4);
        gadget1.printAll();

        gadget2.setBrand("HP");
        gadget2.setPrice(4000000);
        gadget2.ramChoice(16);
        gadget2.printAll();

        laptop1.setBrand("Lenovo");
        laptop1.setPrice(6000000);
        laptop1.ramChoice(8);
        laptop1.setSize(15);
        laptop1.printAll();

        phone1.setBrand("Xiaomi");
        phone1.setPrice(3000000);
        phone1.ramChoice(4);
        phone1.setPixel(64);
        phone1.printAll();

        backpack1.setBrand("Kalibre");
        backpack1.setColor("Black");
        backpack1.printInfo();

        shoes1.setBrand("Decathlon");
        shoes1.setType("Boots");
        shoes1.printInfo();
    }
}
