// Evan Higgins
// 19282508
import java.util.*;
public class TestContactList {
    public static void main(String[] args) {

        ContactList Contacts = new ContactList();

        Contacts.add(new Contact("Alana Sullivan", "0831111111", "alanasullivan@gmail.com", "Alana Sullivan",
                "alana.sullivan", "@alanasullivan"));
        Contacts.add(new Contact("Evan Higgins", "0830000000", "evanhigginsisreallycoolandhumble@live.com", "Evan Higgins", "evanhiggins_", "@evanhiggins"));
        Contacts.add(new Contact("Bob Sullivan", "061000000", "bobbob@bob.com", "Bob Sullivan", "bobsul69", "@bigbadbobsul"));
        Contacts.add(new Contact("Bobby Fischer", "", "FischerRandom@yahoo.com", "", "", ""));
        Contacts.add(new Contact("Greg Gregson", "0831234567", "gregory@greg.com","","",""));
        Contacts.add(new Contact("James O'Brien", "038939291112", "jamesobrienverylongemail@gmail.com","","jamesob.","@jamesobrien"));
        Contacts.add(new Contact("Liam Enright", "", "liamenright@gmail.com", "Liamen Wright", "Niceusername", "@evennicerone"));
        Contacts.add(new Contact("Magnus Carlsen", "03819203021", "magnuscarlsen@carlsen.com", "Magnus Carlsen", "Magnus Carlsen", "@howamithisgood"));
        Contacts.add(new Contact("Anatoly Karpov", "", "", "Anatoly Karpov", "anatolykarpov", "@sacrifice2win"));
        Contacts.add(new Contact("Garry Kasparov", "", "garrykasparov@chessgenius.com", "Garry Kasparov", "", "@defenseisforsuckers"));
        Contacts.add(new Contact("Hikaru Nakamura", "+1 021-304-4988", "hikaru@supergm.com", "Hikaru Nakamura", "HikaruGM", "@HikaruGM"));


        Contacts.Display();

        System.out.println(Contacts.nameFor("0831111111") + "\n");
        System.out.println(Contacts.nameFor("0830000000"));
        System.out.println(Contacts.nameFor("061000000"));
        System.out.println(Contacts.nameFor("7777777" + "\n"));
        System.out.println(Contacts.nameFor("03819203021") + "\n");

        System.out.println(Contacts.numberFor("Evan Higgins") + "\n");
        System.out.println(Contacts.numberFor("Bobby Fischer"));
        System.out.println(Contacts.numberFor("Greg Gregson"));
        System.out.println(Contacts.numberFor("Magnus Carlsen"));
        System.out.println(Contacts.numberFor("Steven Cronin"));

        System.out.println(Contacts.nameFor("0831111111", 3));
        System.out.println(Contacts.nameFor("+1 021-304-4988", 3) + "\n");

        System.out.println(Contacts.numberFor("Bob Sullivan", 5));
        System.out.println(Contacts.numberFor("Bob Sullivan", 1) + "\n");

        ContactList Contacts1 = new ContactList(200);

        Contacts1.add(new Contact("John Doe", "0831234567", "johndoe@gmail.com", "John Doe", "johndoe", "@JohnDoe"));
        Contacts1.add(new Contact("Tony Kelly", "0862349281", "theclaresniper@gmail.com", "Tony Kelly", "Tony Kelly", "@TonyKelly"));
        Contacts1.add(new Contact("Podge Collins", "0862231211", "podgecollins@gmail.com", "Podge Collins", "Podge Collins", "@Podge"));

        Contacts.Display();
		
		ContactList Sorting = new ContactList(5);
		Sorting.add(new Contact("Evan Higgins", "0830000000", "evanhigginsisreallycoolandhumble@live.com", "Evan Higgins", "evanhiggins_", "@evanhiggins"));
        Sorting.add(new Contact("Bob Sullivan", "061000000", "bobbob@bob.com", "Bob Sullivan", "bobsul69", "@bigbadbobsul"));
        Sorting.add(new Contact("Bobby Fischer", "", "FischerRandom@yahoo.com", "", "", ""));
        Sorting.add(new Contact("Greg Gregson", "0831234567", "gregory@greg.com","","",""));
        Sorting.add(new Contact("James O'Brien", "038939291112", "jamesobrienverylongemail@gmail.com","","jamesob.","@jamesobrien"));
        Sorting.add(new Contact("Liam Enright", "", "liamenright@gmail.com", "Liamen Wright", "Niceusername", "@evennicerone"));

		
        System.out.println("The index of Evan Higgins is " + Contacts.indexOf("Evan Higgins") + "\n");

        Contacts.remove("Evan Higgins");
        Contacts.Display();

       
        
        System.out.println("The index of Evan Higgins is " + Contacts.indexOf("Evan Higgins") + "\n");

        Contacts.remove(6);
        Contacts.Display();
        
        Contacts1.remove(0);
        Contacts1.Display();

        
        
        
        

    }

}