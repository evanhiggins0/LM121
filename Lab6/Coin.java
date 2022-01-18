import java.util.Iterator;

/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setValue(double value) {
      this.value = value;
   }

   public double getValue() {
      return value;
   }

   @Override
   public String toString() {
      return "Value = " + value + '\n' +
              "Name = " + name;
   }
}