public class AllOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int price = 100, quantity = 5;
        int totalCost = price * quantity; // Multiplication
        int discount = totalCost / 10; // Division
        int finalPrice = totalCost - discount; // Subtraction
        System.out.println("Total Cost: " + totalCost + ", Discount: " + discount + ", Final Price: " + finalPrice);
        
        // Increment and Decrement Operators
        int stock = 50;
        stock++; // Increment: Adding 1 to stock
        stock--; // Decrement: Subtracting 1 from stock
        System.out.println("Stock after update: " + stock);
        
        // Logical Operators
        boolean isAvailable = stock > 0;
        boolean isDiscounted = discount > 0;
        boolean canBuy = isAvailable && isDiscounted; // Logical AND
        System.out.println("Is Available: " + isAvailable + ", Is Discounted: " + isDiscounted + ", Can Buy: " + canBuy);
        
        // Bitwise Operators
        int securityCode = 12, key = 5;
        int encryptedCode = securityCode ^ key; // XOR for encryption
        int decryptedCode = encryptedCode ^ key; // XOR for decryption
        System.out.println("Encrypted Code: " + encryptedCode + ", Decrypted Code: " + decryptedCode);
        
        // Relational Operators
        boolean isExpensive = finalPrice > 500;
        boolean isAffordable = finalPrice < 500;
        boolean samePrice = finalPrice == 500;
        System.out.println("Is Expensive: " + isExpensive + ", Is Affordable: " + isAffordable + ", Same Price: " + samePrice);
        
        // Assignment Operators
        int budget = 1000;
        budget -= finalPrice; // Deduct final price from budget
        System.out.println("Remaining Budget: " + budget);
        
        // Ternary Operator
        String purchaseMessage = (budget >= 0) ? "Purchase successful!" : "Not enough budget!";
        System.out.println(purchaseMessage);
    }
}
