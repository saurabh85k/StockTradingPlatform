import java.util.HashMap;
public class Portfolio {
     private HashMap<String,Integer> Stock =new HashMap<>();

     public void BuyStock(String symbol,int quantity){
        Stock.put(symbol,Stock.getOrDefault(symbol,0) + quantity);
     }

     public boolean sellStock (String symbol,int quantity){
        int currentQty=Stock.getOrDefault(symbol, 0);
        if(currentQty >= quantity){
            Stock.put(symbol,currentQty-quantity);
            if(Stock.get(symbol) == 0) Stock.remove(symbol);
            return true;
        }
        return false;
     }
     public void ShowPortfolio(){
        System.out.println("YOUR PORTFOLIO");
        for(String symbol: Stock.keySet()){
            System.out.println(symbol + ": " + Stock.get(symbol) + " shares");
        }
     }
}
