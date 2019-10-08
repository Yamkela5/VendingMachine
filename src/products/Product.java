package products;

public class Product {
    public String name;
    public String description;
    public Product(String name, String description) {
        this.description = description;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
