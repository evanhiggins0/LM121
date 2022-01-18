import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
   An appointment calendar.
*/
public class AppointmentCalendar {
   private ArrayList<Appointment> appointments;

   public AppointmentCalendar() {
      appointments = new ArrayList<Appointment>();
   }

   public void add(Appointment a) {
      appointments.add(a);
   }
   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day) {
      ArrayList<Appointment> temp = new ArrayList<Appointment>();
      for (Appointment a : this.appointments) {
         if(a.getDate().getDay() == day.getDay() && a.getDate().getMonth() == day.getMonth()
                 && a.getDate().getYear() == day.getYear()) // well we definitely know the day now
            temp.add(a);
         }
      return temp;
   }

   public void cancel(Appointment a) {
      appointments.remove(a);
   }
}
