// Name - Evan Higgins
// ID - 19282508

import java.util.*;

public class Image {

    private int[][] pixels;

    private int width;

    private int height;

    private int pixelCount;

    public Image(int[][] pixels) {
        this.pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;
        this.pixelCount = this.height * this.width;

        int i = 0;   
        for(int row = 0; row < pixels.length; row++){
            for(int col = 0; col < pixels[0].length; col++){
                this.pixels[row][col] = i++;

            }
        }
    }

    public void portraitMode(boolean portrait){ // this method asks if the image is in portrait mode, if so
        int i = 0;                            // it will iterate through full columns first while initialising                        
        if(portrait == true){
            for(int col = 0; col < pixels[0].length; col++){
                for(int row = 0; row < pixels.length; row++){
                    this.pixels[row][col] = i++;
                }
            }
        }else{                                  // otherwise, the image is not affected
            return;
        }
    }

    public void flip(boolean horizontal){ // flips the image according to the boolean provided
        int middleRow = height / 2;
        int middleCol = width / 2;
        int[] tempArr;
        int temp; 
        if(horizontal == true){
            for(int i = 0; i < (pixels.length / 2); i++) {
                tempArr = pixels[i];
                pixels[i] = pixels[pixels.length - i - 1];
                pixels[pixels.length - i - 1] = tempArr;
            }
        }
        else{
            for(int row = 0; row < pixels.length; row++){
                for(int col = 0; col < (pixels[0].length / 2); col++){
                    temp = pixels[row][col];
                    pixels[row][col] = pixels[row][pixels[0].length - col - 1];
                    pixels[row][pixels[0].length - col - 1] = temp;

                }
            }
        }
    }

    public void rotate(boolean clockwise){ // rotates according to the boolean provided
        int[][] temp2D = new int[width][height];
        int i = 0;
        if(clockwise == true){
            for(int col = temp2D[0].length - 1; col >= 0; col--){
                for(int row = 0; row < temp2D.length; row++){
                    temp2D[row][col] = i++;

                }
                pixels = temp2D;
            }

        }
        else{
            for(int col = 0; col < temp2D[0].length; col++){
                for(int row = temp2D.length - 1; row >= 0; row--){
                    temp2D[row][col] = i++;

                }
            }
            pixels = temp2D;
        }
    }

    public String toString() { 
        String aString = "";
        for(int row = 0; row < pixels.length; row++) {
            for(int col = 0; col < pixels[0].length; col++) {
                if((pixels[row][col] < 10 && pixels[row][pixels[0].length - 1] < 10) || (pixels[row][col] < 10 && pixels[pixels.length - 1][col] > 9)){ // trial and error, if it works it works
                    aString += "|"+ "  " + pixels[row][col] + " ";    
                }else{
                    aString += "|"+ " " + pixels[row][col] + " ";
                }

            }
            aString += "\r\n";
        }
        return aString;
    }
}

