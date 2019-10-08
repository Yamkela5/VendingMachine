package CustomExceptions;
import products.*;
public class ChocolateAllGone extends ProductNotFoundException {

    public ChocolateAllGone(Product product) {
        super(product);
    }
}
