import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
System.out.println("     Welcome to Stock Trading Platform     ");
System.out.println("======================================\n");
        Scanner sc=new Scanner(System.in);
        Portfolio portfolio=new Portfolio();
        Stock s1 = new Stock("AAPL", 150);
        Stock s2 = new Stock("GOOGL", 2800);
        Stock s3 = new Stock("MSFT", 320);
        Stock s4 = new Stock("TSLA", 700);
        Stock s5 = new Stock("AMZN", 3500);
        Stock s6 = new Stock("META", 330);
        Stock s7 = new Stock("NFLX", 600);
        Stock s8 = new Stock("NVDA", 750);
        Stock s9 = new Stock("IBM", 140);
        Stock s10 = new Stock("INTC", 38);

        boolean exit=false;
        while(!exit){
            System.out.println("OPTION 1: BUY");
            System.out.println("OPTION 2: SELL");
            System.out.println("OPTION 3: SHOW PORTFOLIO");
            System.out.println("OPTION 4: EXIT");
            System.out.print("Enter the Choice: ");
            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter stock sysmbol to buy(AAPL/GOOGL/MSFT/TSLA/AMZN/META/NFLX/NVDA/IBM/INTC): ");
                    String BuySTOCK=sc.nextLine().toUpperCase();
                    System.out.print("Enter quantity: ");
                    int buyQty = sc.nextInt();
                    sc.nextLine();
                    if(BuySTOCK.equals("AAPL") || BuySTOCK.equals("GOOGL") || 
                    BuySTOCK.equals("MSFT") || BuySTOCK.equals("TSLA") || 
                    BuySTOCK.equals("AMZN") || BuySTOCK.equals("META") || 
                    BuySTOCK.equals("NFLX") || BuySTOCK.equals("NVDA") ||
                     BuySTOCK.equals("IBM") || BuySTOCK.equals("INTC")){
                        portfolio.BuyStock(BuySTOCK, buyQty);
                        System.out.println("Bought " + buyQty + " shares of " + BuySTOCK);
                        System.out.println("===Thank you for Buy this stock===");
                     }else{
                        System.out.println("Invaid stock symbol!");
                     }
                     break;
                case 2:
                    System.out.print("Enter stock sysmbol to sell(AAPL/GOOGL/MSFT/TSLA/AMZN/META/NFLX/NVDA/IBM/INTC): ");
                    String SellSTOCK=sc.nextLine().toUpperCase();
                    System.out.print("Enter quantity: ");
                    int SellQty = sc.nextInt();
                    sc.nextLine(); 
                    if(portfolio.sellStock(SellSTOCK, SellQty)){
                        System.out.println("Sold " + SellQty  + " shares of " + SellSTOCK);
                    } else {
                        System.out.println("Insufficient shares or invalid symbol!");
                    }
                    break;
                case 3:
                    portfolio.ShowPortfolio();
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                System.out.println("Invalid choice!");
            }
        }
        System.out.println("Thank you for trading1");
    }
}
