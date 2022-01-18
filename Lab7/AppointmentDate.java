import javax.crypto.ExemptionMechanismException;
import java.util.StringTokenizer;

/**
   An appointment date.
*/
public class AppointmentDate
{
   private int year;
   private int month;
   private int day;

   public AppointmentDate(String line)
           throws IllegalArgumentException{

         day = Integer.parseInt(line.substring(0,2));
         month = Integer.parseInt(line.substring(3,5));
         year = Integer.parseInt(line.substring(6,10));

         if(month > 12)
            throw new IllegalArgumentException("Improper Use: Date format required: DD-MM-YYYY");
   }
   public int getDay() {
      return day;
   }

   public int getMonth() {
      return month;
   }

   public int getYear() {
      return year;
   }

   @Override
   public String toString() {
      return "Date: " + day + "/" + month + "/" + year + '\n';
   }
}
