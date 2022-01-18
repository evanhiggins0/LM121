import java.util.ArrayList;
import java.util.Iterator;

/**
   A set of coins.
*/
public class CoinSet{
   private ArrayList<Coin> set;
   public double total;

   /**
    * Constructs a CoinSet object.
    */
   public CoinSet() {
      set = new ArrayList<Coin>();

   }

   public void addCoin(Coin choice) {
      set.add(choice);
      total += choice.getValue();
   }

   public double getTotal() {
      return total;
   }

   public void removeMoney() {
      set.clear();
      total = 0;
   }

   public void removeCoins(double price) {
      double change = total - price;
      set.clear();
      total = 0;
      while (change > 0.05) { // I'm sure there's a more elegant way of dealing with float precision issues, but this is what I used
         if (change >= 1) {
            set.add(new Coin(1, "euro"));
            change -= 1;
            total = total + 1;
         } else if (change >= 0.5) {
            set.add(new Coin(0.5, "50 cent"));
            change -= 0.5;
            total += 0.5;
         } else if (change >= 0.1) {
            set.add(new Coin(0.1, "10 cent"));
            change -= 0.1;
            total += 0.1;
         } else if (change >= 0.05) {
            set.add(new Coin(0.05, "5 cent"));
            change -= 0.05;
            total += 0.05;
         }

      }
   }

   @Override
   public String toString() {
      return "Set =" + set + '\n' +
              "Total =" + total;
   }
}