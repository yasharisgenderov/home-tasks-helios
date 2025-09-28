package Bus_Card_System_App;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        double balance = 10.0;
        double ticketPrice = 0.7;
        System.out.printf("Balansınız: %.2f", balance);
        System.out.println();
        do {
            System.out.println("Avtobusa minirsiniz...");
            if (balance >= ticketPrice) {
                balance -= ticketPrice;
                System.out.printf("✅ Gediş haqqı ödənildi! Yeni balans: %.2f%n", balance);
            } else {
                System.out.printf("❌ Balans kifayət etmir! (%.2f)", balance);
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.println("Balans artırmaq istədiyiniz məbləği daxil edin:");
                double additionalBalance = input.nextDouble();

                balance += additionalBalance;

                System.out.printf("✅ Yeni balans: %.2f", balance);
                System.out.println();
            }
        } while (balance >= 0.00);
    }
}
