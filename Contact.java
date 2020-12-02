
public class Contact{

    private String contactName;
    private String phoneNumber; 
    private String emailAddress;
    private String facebookHandle; 
    private String instagramHandle; 
    private String twitterHandle;

    public String nameList = "Name";
    public String numList = "Phone Number";
    public String emailList = "Email Address";
    public String fbList = "Facebook Handle";
    public String igList = "Instagram Handle";
    public String twList = "Twitter Handle";

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

    public String getContactName(){
        return contactName;
    }

    public void setContactName(String name){
        contactName = name;
    }

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

    public static String centre(String text){
        if(text.length() > 30){
            text = (text.substring(0, 27) + "...\n");
        }else if(text == ""){
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

    public static String expand(String text){
        int n = 17 - text.length();
        if(text != ""){
            for(int i = 0; i < n; i++){
                text = text + " ";
            }
        }else if(text.length() > 17){
            return text.substring(0, 17);
        }
        if(text != ""){
            text = text + ": ";
        }
        return text;  
    }

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

    public String toString(){
        return String.format(change(expand(nameList)) + centre(contactName) + change(expand(numList)) + centre(phoneNumber) + 
            change(expand(emailList)) + centre(emailAddress) + change(expand(fbList)) + centre(facebookHandle) + change(expand(igList)) 
            + centre(instagramHandle) + change(expand(twList)) + centre(twitterHandle));
    }

}

        
        
