import java.util.*;

public class Management {
    public static void main(String[] args) throws Exception {

    Store Electronics = new Store();    
       
    Brand Samsung = new Brand("Samsung", 1);
    Brand Lenovo = new Brand("Lenovo", 2);
    Brand Apple = new Brand("Apple", 3);
    Brand Huawei = new Brand("Huawei", 4);
    Brand Casper = new Brand("Casper", 5);
    Brand Asus = new Brand("Asus", 6);
    Brand HP = new Brand("HP", 7);
    Brand Xiaomi = new Brand("Xiaomi", 8);
    Brand Monster = new Brand("Monster", 9);
    Brand iPhone = new Brand("iPhone", 10);
    Brand OPPO = new Brand("OPPO", 11);

    Electronics.addBrand(Samsung);
    Electronics.addBrand(Lenovo);
    Electronics.addBrand(Apple);
    Electronics.addBrand(Huawei);
    Electronics.addBrand(Casper);
    Electronics.addBrand(Asus);
    Electronics.addBrand(HP);
    Electronics.addBrand(Xiaomi);
    Electronics.addBrand(Monster);
    Electronics.addBrand(iPhone);
    Electronics.addBrand(OPPO);

    Product samsunggalaxya51 = new Product("Samsung Galaxy A51", Samsung, 1, 15000, 0, 25, "6.5", 6, "Siyah", 128, 4000, "Phone");
    Product iphone13 = new Product("iPhone 13", iPhone, 2, 30000, 0, 15, "6.1", 4, "Mavi", 128, 3227, "Phone");
    Product opporeno4pro = new Product("OPPO Reno 4 Pro", OPPO, 3, 8000, 0, 3, "6.5", 8, "Siyah", 256, 4000, "Phone");
    Product hpvictus16 = new Product("HP Victus 16", HP, 4, 41000, 0, 5, "16.1", 32, "Siyah", 1000, 4323, "Notebook");
    Product monsterabraa5 = new Product("Monster Abra A5", Monster, 5, 15000, 0, 1, "15.6", 16, "Siyah", 500, 4200, "Notebook");

    Electronics.addProduct(samsunggalaxya51);
    Electronics.addProduct(iphone13);
    Electronics.addProduct(opporeno4pro);
    Electronics.addProduct(hpvictus16);
    Electronics.addProduct(monsterabraa5);

    boolean state = true;

    while(state){

    try{

        System.out.print("\nPatika Store Product Management System\n\nChoose the action you want:\n\n1-Product Transactions\n2-?\n3-List Brands\n4-List Products\n5-Exit\n\nYour choice : ");

        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();

        switch(choice){

            case 1 : 
            
            System.out.print("\nChoose the transaction you want:\n\n1-Add Product\n2-Remove Product\n\nYour choice : ");
            
            int choice3 = in.nextInt();

            Scanner in2 = new Scanner(System.in);

            switch(choice3){

                case 1 : 

                Brand temp = new Brand("Temp", 0);
                
                System.out.print("\nEnter your Product's information:\n\nName (String) : ");
                
                String name = in2.nextLine();

                System.out.print("\nChoose the Brand: ");

                System.out.println();

                Electronics.printBrands();

                try{

                    System.out.print("\nYour choice : ");

                    int choice4 = in.nextInt();

                    switch(choice4){

                        case 1 : temp = Apple;
                        break;

                        case 2 : temp = Asus;
                        break;

                        case 3 : temp = Casper;
                        break;

                        case 4 : temp = HP;
                        break;

                        case 5 : temp = Huawei;
                        break;

                        case 6 : temp = iPhone;
                        break;

                        case 7 : temp = Lenovo;
                        break;

                        case 8 : temp = Monster;
                        break;

                        case 9 : temp = OPPO;
                        break;

                        case 10 : temp = Samsung;
                        break;

                        case 11 : temp = Xiaomi;
                        break;

                    }

                }catch(Exception e){

                    System.out.println(e.toString());

                }
                

                System.out.print("\nID (int) : ");

                int ID = in2.nextInt();

                System.out.print("\nCost (int) : ");

                int cost = in.nextInt();
                
                System.out.print("\nDiscount (int) : ");

                int discount = in2.nextInt();

                System.out.print("\nStock (int) : ");

                int stock = in2.nextInt();

                System.out.print("\nScreen (String): ");

                String screen = in2.nextLine();

                in2.nextLine();

                System.out.print("\nRAM (int) : ");

                int ram = in2.nextInt();

                System.out.print("\nColor (String) : ");

                String color = in2.nextLine();

                in2.nextLine();

                System.out.print("\nStorage (int) : ");

                int storage = in.nextInt();

                System.out.print("\nBattery (int) : ");

                int battery = in.nextInt();

                System.out.print("\nChoose type:\n1-Phone\n2-Notebook\nYour choice : ");

                int choice5 = in.nextInt();

                String type = " ";

                switch(choice5){

                    case 1 : type = "Phone";
                    break;

                    case 2 : type = "Notebook";
                    break;

                }

                Electronics.addProduct(new Product(name, temp, ID, cost, discount, stock, screen, ram, color, storage, battery, type));

                break;

                case 2 : 

                System.out.println("Choose the Notebook you will remove:");

                Electronics.printProducts();

                System.out.print("\nYour choice : ");

                int choice6 = in.nextInt();

                switch(choice6){

                    case 1 : Electronics.removeProduct(hpvictus16);
                    break;

                    case 2 : Electronics.removeProduct(monsterabraa5);
                    break;

                    case 3 : Electronics.removeProduct(opporeno4pro);
                    break;

                    case 4 : Electronics.removeProduct(samsunggalaxya51);
                    break;

                    case 5 : Electronics.removeProduct(iphone13);
                    break;

                }

                break;

            }

            break;

            case 2 : 
            break;

            case 3 : Electronics.printBrands();
            break;

            case 4 : 

                Scanner in3 = new Scanner(System.in);
            
                System.out.print("\nWhat do you want to list:\n\n1-Notebook\n2-Phone\n3-All Products\n\nYour choice : ");

                int choice2 = in3.nextInt();

                switch(choice2){   
            
                case 1 : 
                
                System.out.print("\nWhat kind of sorting do you want:\n\n1-By name\n2-By ID\n\nYour choice : ");

                int choice7 = in3.nextInt();

                switch(choice7){

                    case 1 : Electronics.printNotebooks();
                    break;

                    case 2 : Electronics.printNotebooksByNumber();
                    break;

                }

                break;

                case 2 : 
                
                System.out.print("\nWhat kind of sorting do you want:\n\n1-By name\n2-By ID\n\nYour choice : ");

                int choice8 = in3.nextInt();

                switch(choice8){

                    case 1 : Electronics.printPhones();
                    break;

                    case 2 : Electronics.printPhonesByNumber();
                    break;

                }

                break;

                case 3 : 
                
                System.out.print("\nWhat kind of sorting do you want:\n\n1-By name\n2-By ID\n\nYour choice : ");

                int choice9 = in3.nextInt();

                switch(choice9){

                    case 1 : Electronics.printProducts();
                    break;

                    case 2 : Electronics.printByNumber();
                    break;

                }
                
                break;

                }
            
            break;

            case 5 : state = false;
            break;

        }

    }catch(Exception e){

        System.out.println(e.toString());

    }

    }

    }

}
