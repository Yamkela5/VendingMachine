package CustomExceptions;
import products.*;

public class ProductNotFoundException extends Exception {

    public ProductNotFoundException(Product product){
        System.out.println(product.getName() + " is not available .." + "");
    }
}
