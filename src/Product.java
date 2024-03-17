public class Product {

    String name;
    Brand brand;
    int ID;
    int cost;
    int discount;
    int stock;
    String screen;
    int ram;
    String color;
    int storage;
    int battery;
    String type;

    public Product(String name, Brand brand, int ID, int cost, int discount, int stock, String screen, int ram, String color, int storage, int battery, String type){

        this.name = name;
        this.brand = brand; 
        this.ID = ID;
        this.cost = cost;
        this.discount = discount;
        this.stock = stock;
        this.screen = screen;
        this.ram = ram;
        this.color = color;
        this.storage = storage;
        this.battery = battery;
        this.type = type;

    }

}
