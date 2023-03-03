import java.util.Scanner;

class Stock {
    private String symbol;
    private int shares;
    private double price;

    Stock(String symbol, int shares, double price) {
        this.symbol = symbol;
        this.shares = shares;
        this.price = price;
    }

    public void buy(int sharesToBuy) {
        if (sharesToBuy <= 0) {
            System.out.println("Invalid shares to buy: " + sharesToBuy);
        } else {
            shares += sharesToBuy;
            System.out.println(sharesToBuy + " shares of " + symbol + " bought at $" + price + " per share");
        }
    }

    public void sell(int sharesToSell) {
        if (sharesToSell <= 0) {
            System.out.println("Invalid shares to sell: " + sharesToSell);
        } else if (sharesToSell > shares) {
            System.out.println("Cannot sell more shares than owned");
        } else {
            shares -= sharesToSell;
            System.out.println(sharesToSell + " shares of " + symbol + " sold at $" + price + " per share");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("Enter number of shares: ");
        int shares = scanner.nextInt();
        System.out.print("Enter price per share: ");
        double price = scanner.nextDouble();
        Stock stock = new Stock(symbol, shares, price);

        System.out.println("\nMenu:");
        System.out.println("1. Buy shares");
        System.out.println("2. Sell shares");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.print("Enter number of shares to buy: ");
                    int sharesToBuy = scanner.nextInt();
                    stock.buy(sharesToBuy);
                    break;
                case 2:
                    System.out.print("Enter number of shares to sell: ");
                    int sharesToSell = scanner.nextInt();
                    stock.sell(sharesToSell);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        }
        System.out.println("Goodbye!");
    }
}
