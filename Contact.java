// Evan Higgins
// One part of my submission for Assignment 3 of Intro to Programming, which was to build a class that would create a "contact list" of information for a person, similar to that on a phone.
// We had to follow specific guidelines in relation to formatting. 

public class Contact{
	
	// private string variables to contain input data from objects
    private String contactName;
    private String phoneNumber; 
    private String emailAddress;
    private String facebookHandle; 
    private String instagramHandle; 
    private String twitterHandle;
	
	// public "constant" string variables
    public String nameList = "Name";
    public String numList = "Phone Number";
    public String emailList = "Email Address";
    public String fbList = "Facebook Handle";
    public String igList = "Instagram Handle";
    public String twList = "Twitter Handle";

	// setting up for object usage
    public Contact(String name){
        contactName = name;
    }
    
    public Contact(String name, String number){
        contactName = name;
        phoneNumber = number;
        emailAddress = null;
        facebookHandle = null;
        instagramHandle = null;
        twitterHandle = null;
    }

    public Contact(String name, String number, String email){
        contactName = name;
        phoneNumber = number;
        emailAddress = email;
        facebookHandle = null;
        instagramHandle = null;
        twitterHandle = null;
    }

    public Contact(String name, String number, String email, String facebook, String instagram, String twitter){
        contactName = name;
        phoneNumber = number;
        emailAddress = email;
        facebookHandle = facebook;
        instagramHandle = instagram;
        twitterHandle = twitter;
    }
	// returns the current variable value
    public String getContactName(){
        return contactName;
    }
	// sets the variable value
    public void setContactName(String name){
        contactName = name;
    }
    // rinse and repeat
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String number){
        phoneNumber = number;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String email){
        emailAddress = email;
    }

    public String getFacebookHandle(){
        return facebookHandle;
    }

    public void setFacebookHandle(String facebook){
        facebookHandle = facebook;
    }

    public String getInstagramHandle(){
        return instagramHandle;
    }

    public void setInstagramHandle(String instagram){
        instagramHandle = instagram;
    }

    public String getTwitterHandle(){
        return twitterHandle;
    }

    public void setTwitterHandle(String twitter){
        twitterHandle = twitter;
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
        if(contactName  == ""){
            nameList = "";
        }
        if(phoneNumber == ""){
            numList = "";
        }
        if(emailAddress == ""){
            emailList = "";
        }
        if(facebookHandle == ""){
            fbList = "";
        }
        if(instagramHandle == ""){
            igList = "";
        }
        if(twitterHandle == ""){
            twList = "";
        }
        return text;
    }
	// creates desired format
    public String toString(){
        return String.format(change(expand(nameList)) + centre(contactName) + change(expand(numList)) + centre(phoneNumber) + 
            change(expand(emailList)) + centre(emailAddress) + change(expand(fbList)) + centre(facebookHandle) + change(expand(igList)) 
            + centre(instagramHandle) + change(expand(twList)) + centre(twitterHandle));
    }

}

        
        
