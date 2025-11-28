public class Product {
        private String name;
        private double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() { return name; }
        public double getPrice() { return price; }

        // Small display helper
        public void display() {
            System.out.printf("%s - $%.2f%n", name, price);
        }
    }

