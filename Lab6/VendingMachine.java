import java.util.*;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }

   public Product[] getProductTypes() throws VendingException {
      // convert to LinkedHashSet to remove dups and preserve order, then convert to array

      if(products.isEmpty())
         throw new VendingException("No products available. Try add some!");

      Set<Product> set = new LinkedHashSet<>(products);
      Product[] array = new Product[set.size()];
      set.toArray(array);
      return array;
   }

   public void addCoin(Coin choice) {
      currentCoins.addCoin(choice);
      System.out.printf("\n%.2f added. Current coin total: %.2f\n", choice.getValue(), currentCoins.getTotal());
   }

   public double removeMoney() {             // THIS MIGHT NOT WORK edit: ok maybe it'll work
      double amount = currentCoins.getTotal();
      currentCoins.removeMoney();
      return amount;
   }

   public void buyProduct(Product p) throws VendingException {
      if(products.isEmpty() == true){
         throw new VendingException("No products available. Try add some!");
         }

      if (p.getPrice() <= currentCoins.getTotal()) {
         System.out.println("Thank you - no change below 5 cent possible.");
         currentCoins.removeCoins(p.getPrice());
         products.remove(p);
         System.out.printf("New Balance: %.2f\n", currentCoins.getTotal());

      }else{
         throw new VendingException("Insufficient coins.");

      }
   }

   public void addProduct(Product product, int quantity) {
      for(int i = 0; i < quantity; i++)
         products.add(product);
   }


}