package vendingMachine;

import products.*;
import CustomExceptions.*;

public class VendingMachine {

    private static int stockCount;
    private static int saltySnackCount;
    private static int softDrinksCount;
    private static int chocolateCount;

    public static String buy(Product product) throws ProductNotFoundException{
        if (product instanceof Product) {
            if (product instanceof Chocolates) {
                if (chocolateCount > 0) {
                    chocolateCount--;
                    stockCount--;
                } else {
                    throw new ChocolateAllGone(product);
                }
            }
            if (product instanceof SoftDrinks) {
                if (softDrinksCount > 0) {
                    softDrinksCount--;
                    stockCount--;
                } else {
                    throw new SoftDrinksOutOfStockException(product);

                }

            }
            if (product instanceof SaltyCracks) {
                if (saltySnackCount > 0) {
                    saltySnackCount--;
                    stockCount--;
                } else {
                    throw new SaltyCracksAllEatenException(product);
                }

            }
        }
        else {
            throw new InvalidProductException();
        }



        return null;

    }
    public static void addStock(Product product, int newStock) {
        if (product instanceof Chocolates){
            chocolateCount += newStock;
        }
        if (product instanceof SoftDrinks){
            softDrinksCount += newStock;
        }
        if (product instanceof SaltyCracks  ){
            saltySnackCount += newStock;
        }
        stockCount += newStock;
    }

    public static int getStockCount() {
        return stockCount;
    }

    public  static void main(String[] args) throws ProductNotFoundException {

        Product coke = new SoftDrinks("simba", "cocs");
        Product salty = new SaltyCracks("Massai", "Salty");
        Product Choc = new Chocolates("Bubbly","Sweet");
        addStock(coke, 0);
        addStock(salty,2);
        addStock(Choc,4);
        buy(salty);
        buy(coke);


        System.out.println(getStockCount());
        System.out.println(saltySnackCount);




    }
}
