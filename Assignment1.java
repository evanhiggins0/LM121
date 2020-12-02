// Evan Higgins
// First assignment for Intro to Programming - Problem was to code a simple "contact card" matching the shown layout.

public class ContactCard{
    public static void main(String[] args){
        
        final String fb = "\uD83D\uDDFF";       // l = 2
        final String tw = "\uD83D\uDC26";       // l = 2
        final String insta = "\uD83D\uDCF7";    // l = 2
        final String mail = "\u2709";           // l = 1
        
        // variables containing info strings, 
		// and int values of spaces required in layout format
        
        String name = "Evan Higgins";           // l = 12
        int nameSpaces = 40 - name.length();
        
        String phoneNum = "+353 (0)83 0000000";      // l = 18
        int phoneNumSpaces = 40 - phoneNum.length();
        
        String email = "19282508@studentmail.ul.ie"; // l = 26
        int emailSpaces = 40 - email.length();
        
        String fbUser = "Evan Higgins"; // l = 12
        int fbUserSpaces = 27 - fbUser.length();
        
        String twUser = "@EvanHiggins"; // l = 12
        int twUserSpaces= 27 - twUser.length();
        
        String igUser = "evanhiggins";  // l = 11
        int igUserSpaces = 27 - igUser.length();
        
        String mailCode = "XYZ 1234";   // l = 8
        int mailCodeSpaces = 28 - mailCode.length();
        int phoneNumSpaces1, phoneNumSpaces2;
       
        
        // prints the name, then uses a for loop to print space character accordingly

        System.out.printf("%s",name);
        for(int i = 0; i < nameSpaces; i++){
            System.out.print(" ");}
        
        // these loops check if phone number has even 
		// or odd character length, and adjusts accordingly
		
        if(phoneNumSpaces % 2 == 1){
            phoneNumSpaces1 = phoneNumSpaces + 1;
        }else{
            phoneNumSpaces1 = phoneNumSpaces;}
        for(int i = 0; i < phoneNumSpaces1 / 2; i++){
            System.out.print(" ");}
			
        System.out.printf("%s",phoneNum);
		
        if(phoneNumSpaces % 2 == 1){
            phoneNumSpaces2 = phoneNumSpaces - 1;
        }else{
            phoneNumSpaces2 = phoneNumSpaces;}
        for(int i = 0; i < phoneNumSpaces2 / 2; i++){
            System.out.print(" ");}
        
        for(int i = 0; i < emailSpaces; i++){
            System.out.print(" ");}
        
		System.out.printf("%s\n",email);
        
        // end of line one
        
        System.out.printf("%s:%s", fb, fbUser);
        for(int i = 0; i < fbUserSpaces; i++){
            System.out.print(" ");}
        
        System.out.printf("%s:%s", tw, twUser);
        for(int i = 0; i < twUserSpaces; i++){
            System.out.print(" ");}
        
        System.out.printf("%s:%s", insta, igUser);
        for(int i = 0; i < igUserSpaces; i++){
            System.out.print(" ");}
        
        System.out.printf("%s:%s", mail, mailCode);
        for(int i = 0; i < mailCodeSpaces; i++){
            System.out.print(" ");}
            
        
        
        // tried using iteration to go through an array to find the character totals 
		// for each string but found it tricky to work out how to center
		// the phone num using that method
       

}
}
