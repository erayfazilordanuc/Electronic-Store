import java.util.Comparator;

public class NumberCompareProducts implements Comparator<Product>{
    
    @Override
    public int compare(Product p1, Product p2){

        return p1.ID - p2.ID;

    }

}
