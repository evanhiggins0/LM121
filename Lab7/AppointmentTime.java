import java.util.StringTokenizer;

/**
   An appointment time.
*/
public class AppointmentTime
{ 
   private int hours;
   private int minutes;

   public AppointmentTime(String s) {
      String[] times = s.split("[:. ]");
      hours = Integer.parseInt(times[0]);
      minutes = Integer.parseInt(times[1]);
   }

   public String getTime() {
      String time = hours + ":" + minutes;
      String[] temp = time.split(":");
      String append = "0";
      if(Integer.parseInt(temp[1]) < 10) {
         time = temp[0] + ":" + "0" + temp[1];
      }
      if(Integer.parseInt(temp[0]) < 10) {
         time = "0" + time;
      }
      return time;

   }
   @Override
   public String toString() {
      return getTime();
   }
}
