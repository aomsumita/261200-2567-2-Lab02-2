//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 50.00);

        book.displayDetails();

        System.out.println("\nApplying discounts:");
        book.applyDiscount(-20);   // Invalid discount
        book.applyDiscount(0);     // Invalid discount
        book.applyDiscount(0.5);   // Valid discount
        book.applyDiscount(25.00); // Valid discount
        book.applyDiscount(50);    // Valid discount
        book.applyDiscount(100);   // Invalid discount
        book.applyDiscount(150);   // Invalid discount

        System.out.println("\nFinal book details:");
        book.displayDetails();
    }
}