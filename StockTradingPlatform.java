import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock tata = new Stock("TATA", 850);
        Stock reliance = new Stock("RELIANCE", 2500);

        Portfolio portfolio = new Portfolio();

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Stocks");
                    System.out.println("1. TATA - ₹850");
                    System.out.println("2. RELIANCE - ₹2500");
                    break;

                case 2:
                    System.out.println("1. TATA");
                    System.out.println("2. RELIANCE");
                    int b = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    if (b == 1)
                        portfolio.buyStock(tata, qty);
                    else
                        portfolio.buyStock(reliance, qty);

                    break;

                case 3:
                    System.out.println("1. TATA");
                    System.out.println("2. RELIANCE");
                    int s = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int sqty = sc.nextInt();

                    if (s == 1)
                        portfolio.sellStock(tata, sqty);
                    else
                        portfolio.sellStock(reliance, sqty);

                    break;

                case 4:
                    portfolio.displayPortfolio();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}