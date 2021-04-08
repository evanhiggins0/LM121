import java.util.*;
import java.io.*;

public class Dictionary {
    private ArrayList<String> dictionary;

    public Dictionary() {
        this.dictionary = new ArrayList<String>();
        loadWordsFromFile("BasicEnglish.txt");
    }

    public Dictionary(String filename) {
        this.dictionary = new ArrayList<String>();
        loadWordsFromFile(filename);
    }

    public void include(String newWord) {
        newWord = newWord.toLowerCase();

        int index = 
               Collections.binarySearch(this.dictionary,newWord);
        if(index < 0) {
            index = -(index+1);
            this.dictionary.add(index,newWord);
        } 
    }


    private void loadWordsFromFile(String filename) {
        File words = new File(filename);
        Scanner scan = new Scanner(words);
        while(scan.hasNext()) {
            this.dictionary.include(scan.next());
        }
    }

    public ArrayList<String> predict(String portion) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < this.dictionary.size(); i++) {
            if (this.dictionary.get(i).startsWith(portion) {
                result.add(this.dictionary.get(i));
            }
        }
        if(result.isEmpty() == true){
            System.out.println("There are no words that begin with " + portion + " in this dictionary.");
        }else {
            return result;
        }
    }

    public boolean spellCheck(String aWord) {
        if(this.dictionary.contains(aWord) == true){
            System.out.println("This dictionary contains " + aWord + ".");
        }else{
            System.out.println("No such word found.");

        }

    }

    public void display(int wordsPerLine) {
        int j = 0;
        for(int i = 0; i < this.dictionary.size(); i++)
            if(j < wordsPerLine){
                System.out.print(this.dictionary.get(i) + " ");
                j++;
            }else{
                System.out.print(" ");
                j = 0;
            }
        }
    }

 //   public ArrayList<String> chooseNWordsRandomly(int n) {
        // Insert your code here
 //   }

 //   public ArrayList<String> randomlyChooseNWordsWithLengthsBetween(int n, int shortest, int longest) {
        // Insert your code here

   // }
//}