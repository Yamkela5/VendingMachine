package Exceptions;

public class InvalidProductException extends RuntimeException {
       public InvalidProductException(){
           System.out.println("Product not found");
    }

}
