import java.util.Comparator;

public class CompareBrands implements Comparator<Brand>{
    
    @Override
    public int compare(Brand b1, Brand b2){

        return b1.name.compareTo(b2.name);

    }

}
