package Exceptions;

public class Product {
    public String name;
    public String description;
    public Product(String name, String description) {
        this.description = description;
        this.name = name;
    }
    String getName(){
        return name;
    }
    String getDescription(){
        return description;
    }
}
