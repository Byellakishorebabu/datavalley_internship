import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        serializeProduct();

        Product product = deserializeProduct();
        if (product != null) {
            System.out.println("Deserialized Product Details:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        }
    }

    
    private static void serializeProduct() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("product.ser"))) {
            Product product = new Product(1, "Laptop", "Electronics", 999.99);
            outputStream.writeObject(product);
            System.out.println("Product serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static Product deserializeProduct() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("product.ser"))) {
            Product product = (Product) inputStream.readObject();
            System.out.println("Product deserialized successfully.");
            return product;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

