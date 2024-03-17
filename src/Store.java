import java.util.*;

public class Store {
    
    private TreeSet<Brand> brands = new TreeSet<Brand>(new CompareBrands());

    private TreeSet<Product> products = new TreeSet<Product>(new CompareProducts());

    private TreeSet<Product> productsSortedByID = new TreeSet<Product>(new NumberCompareProducts());

    public void addBrand(Brand b){

        brands.add(b);

    }

    public void addProduct(Product p){

        products.add(p);
        productsSortedByID.add(p);

    }

    public void removeBrand(Brand b){

        brands.remove(b);

    }

    public void removeProduct(Product p){

        products.remove(p);

    }

    public void printBrands(){

        int counter=1;

        System.out.println();

        for(Brand b : brands){

            System.out.println(counter + "-" + b.name);

            counter++;

        }

    }

    public void printProducts(){

        int counter=1;

        System.out.println();

        for(Product p : products){

            System.out.println(counter + "-" + p.name);

            counter++;

        }

    }

    public void printNotebooks(){

        int counter=1;

        System.out.println();

        for(Product p : products){

            if(p.type.equals("Notebook")){

            System.out.println(counter + "-" + p.name);

            counter++;

            }

        }

    }

    public void printNotebooksByNumber(){

        int counter=1;

        System.out.println();

        for(Product p : productsSortedByID){

            if(p.type.equals("Notebook")){

            System.out.println(counter + "-" + p.name);

            counter++;

            }

        }

    }

    public void printPhones(){

        int counter=1;

        System.out.println();

        for(Product p : products){

            if(p.type.equals("Phone")){

            System.out.println(counter + "-" + p.name);

            counter++;

            }

        }

    }

    public void printPhonesByNumber(){

        int counter=1;

        System.out.println();

        for(Product p : productsSortedByID){

            if(p.type.equals("Phone")){

            System.out.println(counter + "-" + p.name);

            counter++;

            }

        }

    }

    public void printByNumber(){

        int counter=1;

        System.out.println();

        for(Product p : productsSortedByID){

            System.out.println(counter + "-" + p.name);

            counter++;

        }

    }

}


