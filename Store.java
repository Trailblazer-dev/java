public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;//this.
    inventoryCount = count;
    inventoryPrice = price;
  }
 //to return method to facilitate clear output
 public String toString(){
  return "Our first shop sells " + productType + " at "+inventoryCount + " "+ inventoryPrice+"per unit";
 } 
 //data types:
 //(1)primitive data type:byte<int<long, float<double<,char'a','b',String
 //(2)reference 
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    //datatype(reference)----nameofvariable 
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    System.out.println(cookieShop);
    System.out.println(lemonadeStand);
  }
}
    
