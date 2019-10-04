package Exceptions;

public class SaltyDrinkOutOfStock extends ProductNotFoundException {
    public SaltyDrinkOutOfStock(Product product) {
        super(product);
    }
}
