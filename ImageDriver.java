
import java.util.*;

public class ImageDriver{
    public static void main(String args[]){
        
        int[][] rxc1, rxc2, rxc3, rxc4;
        rxc1 = new int[10][10];
        rxc2 = new int[5][5];
        rxc3 = new int[5][10];
        rxc4 = new int[6][3];
        
       Image picture = new Image(rxc1);
       Image picture1 = new Image(rxc2);
       Image picture2 = new Image(rxc3);
       Image picture3 = new Image(rxc4);
       
       picture1.portraitMode(true);
       picture3.portraitMode(true);
        
       System.out.println(picture);
       System.out.println(picture1);
       //System.out.println(picture2);
       //System.out.println(picture3);
        
       picture.flip(true);
       
       picture1.flip(false);
        
       System.out.println(picture);
       
       System.out.println(picture1);
       
       picture.rotate(true);
       
       picture1.rotate(false);
        
       System.out.println(picture);
       System.out.println(picture1);
        
       
        
        
        
        
        
        
        
        
        
        
    }
}
        
