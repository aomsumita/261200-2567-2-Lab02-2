public class Book {
    String title ;
    String author ;
    double price;


    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double discount) {
        if (discount > 0.00 && discount < 100.00 ) {
            double discountAmount = price * (discount / 100.0);
            price -= discountAmount; // announce discount Amount for keep variable 'newprice'
            System.out.printf("Discount of %.2f%% . New price: $%.2f\n", discount, price);
        } else {
            System.out.println("Invalid discount percentage. It must be between 0.00 and 100.00.");
        }
    }
}

