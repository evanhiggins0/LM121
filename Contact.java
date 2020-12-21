// Evan Higgins
// 19282508
import java.util.Arrays;
import java.util.Comparator;

public class Contact implements Comparable<Contact> {

    // string variables to contain input data from objects
    public String contactName;
    public String phoneNumber; 
    public String emailAddress;
    public String facebookHandle; 
    public String instagramHandle; 
    public String twitterHandle;

    // public "constant" string variables
    public String nameList = "Name";
    public String numList = "Phone Number";
    public String emailList = "Email Address";
    public String fbList = "Facebook Handle";
    public String igList = "Instagram Handle";
    public String twList = "Twitter Handle";

    // setting up for object usage
    public Contact(String contactName){
        this(contactName,"","","","","");
    }

    public Contact(String contactName, String phoneNumber){
        this(contactName,phoneNumber,"","","","");
    }

    public Contact(String contactName, String phoneNumber, String emailAddress){
        this(contactName,phoneNumber,emailAddress,"","","");
    }

    public Contact(String name, String number, String email, String facebook, String instagram, String twitter){
        this.contactName = name;
        this.phoneNumber = number;
        this.emailAddress = email;
        this.facebookHandle = facebook;
        this.instagramHandle = instagram;
        this.twitterHandle = twitter;
    }
    // returns the current variable value
    public String getContactName(){
        return this.contactName;
    }
    // sets the variable value
    public void setContactName(String name){
        this.contactName = name;
    }
    // rinse and repeat for all inputs
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setEmailAddress(String email){
        this.emailAddress = email;
    }

    public String getFacebookHandle(){
        return this.facebookHandle;
    }

    public void setFacebookHandle(String facebook){
        this.facebookHandle = facebook;
    }

    public String getInstagramHandle(){
        return this.instagramHandle;
    }

    public void setInstagramHandle(String instagram){
        this.instagramHandle = instagram;
    }

    public String getTwitterHandle(){
        return this.twitterHandle;
    }

    public void setTwitterHandle(String twitter){
        this.twitterHandle = twitter;
    }
    // method to centre "input" text, ie. second column. 
    public static String centre(String text){
        if(text.length() > 30){
            text = (text.substring(0, 27) + "...\n");
        }else if(text == ""){ // if user input is blank, we do not add any spaces.
            return text;
        }else{
            int width = 30;
            int spaceSize = width - text.length();
            int spaceStart = text.length() + spaceSize / 2;
            text = String.format("%" + spaceStart + "s", text);
            text = String.format("%-" + width + "s" + "\n", text);

        }
        return text; 
    }
    // method to expand "contant" text, ie. first column
    public static String expand(String text){
        int n = 17 - text.length();
        if(text != ""){ // checks if text isn't blank, if so expands
            for(int i = 0; i < n; i++){
                text = text + " ";
            }
        }else if(text.length() > 17){
            return text.substring(0, 17);
        }
        if(text != ""){// checks if text isn't blank, if so appends ": " to end
            text = text + ": ";
        }
        return text;  
    }
    // checker which verifies the length of the corresponding "input" for the "contant", and if there is no user input for object, does not print the corresponding contant
    public String change(String text){
        if(this.contactName  == ""){
            nameList = "";
        }
        if(this.phoneNumber == ""){
            numList = "";
        }
        if(this.emailAddress == ""){
            emailList = "";
        }
        if(this.facebookHandle == ""){
            fbList = "";
        }
        if(this.instagramHandle == ""){
            igList = "";
        }
        if(this.twitterHandle == ""){
            twList = "";
        }
        return text;
    }
    // creates desired format
    public String toString(){
        return String.format(change(expand(nameList)) + centre(this.contactName) + change(expand(numList)) + centre(this.phoneNumber) + 
            change(expand(emailList)) + centre(this.emailAddress) + change(expand(fbList)) + centre(this.facebookHandle) + change(expand(igList)) 
            + centre(this.instagramHandle) + change(expand(twList)) + centre(this.twitterHandle));
    }
    
    // compareTo method, using contactName
    public int compareTo(Contact other) {  
        return this.contactName.compareTo(other.contactName);
    }
    
        
}

        