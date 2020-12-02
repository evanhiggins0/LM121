// Evan Higgins
// Assignment 2 for Intro to Programming - Build a class with specific methods to allow the driver code provided to us to function correctly (driver code uploaded as "TestMyToolBox.java").
public class MyToolBox{
    
    public static String repeat(String text, int times){
        return text.repeat(times);
    }

    public static String noTrailingSpaces(String text){
        return text.trim();
    }

    public static String centre(String text, int width){
        int spaceSize = width - text.length();
        int spaceStart = text.length() + spaceSize / 2;
        
        text = String.format("%" + spaceStart + "s", text);
        text = String.format("%-" + width + "s", text);
        return text.substring(0, width);
        
        
    }
    
    public static String expand(String text, int width){
        int n = width - text.length();
        if(text.length() < width){
            for(int i = 0; i < n; i++){
                text = text + " ";
            }
        }else{
            return text.substring(0, width);
        }
        return text;   
    }
    //  a bit of deja vu
    public static String trim(String text, int width){ 
//        int n = width - text.length();
//        if(text.length() < width){
//            for(int i = 0; i < n; i++){
//               text = text + " ";
//            }
//        }else{
//			return text.substring(0, width);
//        }
//        return text;  
        return expand(text, width); // that's better
}
}
