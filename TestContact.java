// Evan Higgins
// Driver code for Contact.java, this time created by myself. Creating a few objects from the Contact class, and proving the getters and setters work correctly.

public class TestContact{
    public static void main(String[] args){
        
        Contact alana = new Contact("Alana Sullivan", "0831111111", "alanasullivan@gmail.com", "Alana Sullivan", "alana.sullivan", "@alanasullivan");
        Contact evan = new Contact("Evan Higgins", "0830000000", "evanhigginsisreallycoolandhumble@live.com", "Evan Higgins", "evanhiggins_", "@evanhiggins");
        Contact bob = new Contact("Bob Sullivan", "061000000", "bobbob@bob.com", "Bob Sullivan", "bobsul69", "@bigbadbobsul");
        Contact bobby = new Contact("Bobby Fischer", "", "FischerRandom@yahoo.com", "", "", "");
        Contact greg = new Contact("Greg Gregson", "0831234567", "gregory@greg.com","","","");
        Contact james = new Contact("James O'Brien", "038939291112", "jamesobrienverylongemail@gmail.com","","jamesob.","@jamesobrien");
        Contact liam = new Contact("Liam Enright", "", "liamenright@gmail.com", "Liamen Wright", "Niceusername", "@evennicerone");
        Contact magnus = new Contact("Magnus Carlsen", "03819203021", "magnuscarlsen@carlsen.com", "Magnus Carlsen", "Magnus Carlsen", "@howamithisgood");
        Contact anatoly= new Contact("Anatoly Karpov", "", "", "Anatoly Karpov", "anatolykarpov", "@sacrifice2win");
        Contact garry = new Contact("Garry Kasparov", "", "garrykasparov@chessgenius.com", "Garry Kasparov", "", "@defenseisforsuckers");
        Contact hikaru = new Contact("Hikaru Nakamura", "+1 021-304-4988", "hikaru@supergm.com", "Hikaru Nakamura", "HikaruGM", "@HikaruGM");
        
        System.out.println(hikaru.getContactName() + "'s phone number is " + hikaru.getPhoneNumber() + "\n");
        System.out.println(alana.getContactName() + "'s email address is " + alana.getEmailAddress() + "\n");
        System.out.println("You can follow " + garry.getContactName() + " on Twitter here: " + garry.getTwitterHandle() + "\n");
        
        System.out.println(alana);
        System.out.println(evan);
        System.out.println(bob);
        System.out.println(bobby);
        System.out.println(greg);
        System.out.println(james);
        System.out.println(liam);
        System.out.println(magnus);
        System.out.println(anatoly);
        System.out.println(garry);
        System.out.println(hikaru);
    }
    
}
