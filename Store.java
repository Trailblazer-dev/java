public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
 //to return method to facilitate clear output
 public String toString(){
  return "Our first shop sells " + productType + " at "+inventoryCount + " "+ inventoryPrice+"per unit";
 } 
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    System.out.println(cookieShop);
    System.out.println(lemonadeStand);
  }
}
    
