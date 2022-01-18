/**
   An appointment.
*/
public class Appointment {
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   public Appointment(String line)
           throws IllegalArgumentException {

      String input[] = line.split(" ");

      if (input.length == 4) {
         description = input[0];
         day = new AppointmentDate(input[1]);
         from = new AppointmentTime(input[2]);
         to = new AppointmentTime(input[3]);
      } else {
         throw new IllegalArgumentException("Incorrect usage. Usage must be: Description Date From To");
      }
   }

   public AppointmentDate getDate() {
      return day;
   }

   public String getDescription() {
      return description;
   }

   public AppointmentTime getFrom() {
      return from;
   }

   public AppointmentTime getTo() {
      return to;
   }
   public String format() {
      return toString();
   }

   @Override
   public String toString() {
      return '\n' + "Description = " + description + '\n' +
              day.toString() + "From: " + from.toString() + "\nTo: " + to.toString();
   }
}



