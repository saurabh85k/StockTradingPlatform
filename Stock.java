public class Stock{
     private String symbol;
     private double price;
      public Stock(String symbol,double price){
        this.symbol=symbol;
        this.price=price;
     }

     public String getsymbol(){
        return symbol;
     }

     public double getprice(){
        return price;
     }

     public void setprice(double price){
        this.price=price;
     }
}