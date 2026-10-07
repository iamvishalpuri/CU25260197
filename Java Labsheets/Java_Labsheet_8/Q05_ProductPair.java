public class Q05_ProductPair {
    static class Product<T, U> {
        private final T id;
        private final U price;
        Product(T id, U price) { this.id = id; this.price = price; }
        void display() { System.out.println("Product ID: " + id + ", Price: " + price); }
    }

    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 499.99);
        Product<Integer, Double> p2 = new Product<>(102, 799.50);
        Product<Integer, Double> p3 = new Product<>(103, 1299.00);
        p1.display();
        p2.display();
        p3.display();
    }
}

/*
Output:
Product ID: 101, Price: 499.99
Product ID: 102, Price: 799.5
Product ID: 103, Price: 1299.0
*/
