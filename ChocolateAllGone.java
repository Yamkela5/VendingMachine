package Exceptions;

public class ChocolateAllGone extends ProductNotFoundException {

    public ChocolateAllGone(Product product) {
        super(product);
    }
}
