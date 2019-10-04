package Exceptions;

public class SoftDrinkOutOfStock extends ProductNotFoundException {
    public SoftDrinkOutOfStock(Product product) {
        super(product);
    }
}
