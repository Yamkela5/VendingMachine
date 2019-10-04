package Exceptions;

public class VendingMachine {

    private static int StockCount;
    private static int SaltySnackCount;
    private static int SoftDrinksCount;
    private static int ChocolateCount;

    public static String buy(Product product) throws ProductNotFoundException{
        if (product instanceof Product) {
            if (product instanceof Chocolates) {
                if (ChocolateCount > 0) {
                    ChocolateCount--;
                    StockCount--;
                } else {
                    throw new ProductNotFoundException(product);
                }
            }
            if (product instanceof SoftDrinks) {
                if (SoftDrinksCount > 0) {
                    SoftDrinksCount--;
                    StockCount--;
                } else {
                    throw new ProductNotFoundException(product);

                }

            }
            if (product instanceof SaltySnacks) {
                if (SaltySnackCount > 0) {
                    SaltySnackCount--;
                    StockCount--;
                } else {
                    throw new ProductNotFoundException(product);
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
            ChocolateCount += newStock;
        }
        if (product instanceof SoftDrinks){
            SoftDrinksCount += newStock;
        }
        if (product instanceof SaltySnacks  ){
            SaltySnackCount += newStock;
        }
        StockCount += newStock;
    }

    public static int getStockCount() {
        return StockCount;
    }

    public  static void main(String[] args) throws ProductNotFoundException {

        Product coke = new SoftDrinks("simba", "cocs");
        Product salty = new SaltySnacks("Massai", "Salty");
        Product Choc = new Chocolates("Bubbly","Sweet");
        addStock(coke, 0);
        addStock(salty,0);
        addStock(Choc,4);
        buy(salty);


        System.out.println(getStockCount());




    }
}
