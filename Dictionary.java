//********************//
// Name: Evan Higgins //
//   ID: 19282508     //
//********************//

// Updated with better format when printed to console :)

import java.util.*;
import java.io.*;

public class Dictionary {
    private ArrayList<String> dictionary;
	private String break = "---------------------";

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
        try{
            System.out.println("Attempting to load file...");
            File words = new File(filename);
            Scanner scan = new Scanner(words);
            while(scan.hasNext()) {
                include(scan.next());
            }
        }catch (IOException e){
            System.out.println("I'm sorry User, I'm afraid I can't do that. Cannot find this filename.");
        }
        System.out.println("Loading of " + filename + " successful.");
        System.out.println(break);
    }

    public ArrayList<String> predict(String portion) {
        System.out.println("Searching this dictionary for words beginning with " + portion + "...");
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < this.dictionary.size(); i++) {
            if (this.dictionary.get(i).startsWith(portion)){
                result.add(this.dictionary.get(i));
            }
        }
        if(result.isEmpty() == true){
            System.out.println("There are no words that begin with " + portion + " in this dictionary...");

        }else{
            for(int i = 0; i < result.size(); i++){
                System.out.println(result.get(i));
            }

        }
        System.out.println(break);
        return null;
    }

    public boolean spellCheck(String aWord) {
        if(this.dictionary.contains(aWord) == true){
            System.out.println("Yes, this dictionary contains " + aWord);
            System.out.println(break);
            return true;
        }else{
            System.out.println("No, this dictionary does not contain " + aWord);
            System.out.println(break);
            return false;
        }
        

    }

    public void display(int wordsPerLine) {
        int j = 0;
        for(int i = 0; i < this.dictionary.size(); i++)
            if(j < wordsPerLine){
                System.out.print(this.dictionary.get(i) + " ");
                j++;
            }else{
                System.out.print("\n");
                j = 0;
            }
            System.out.println(break);
    }

    public ArrayList<String> chooseNWordsRandomly(int n) {
        // Insert your code here
        ArrayList<String> randomSorted = new ArrayList<String>();
        ArrayList<String> random = new ArrayList<String>(this.dictionary);
        Collections.shuffle(random);
        System.out.println("Attempting to choose " + n + " random words from this dictionary...");

        if(n > random.size()){
            System.out.print("There are only " + random.size() + " words in this dictionary. Randomising the list...");
            randomSorted.addAll(0, random);
        }else{
            for(int i = 0; i < n; i++){
                randomSorted.add(random.get(i));
            }}

        Collections.sort(randomSorted, new Comparator<String>() { 
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

        for(int i = 0; i < randomSorted.size(); i++){
            System.out.println(randomSorted.get(i));
        }
        System.out.println(break);
        return null;
    }

    public ArrayList<String> randomlyChooseNWordsWithLengthsBetween(int n, int shortest, int longest) {
        // Insert your code here
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> random = new ArrayList<String>(this.dictionary);
        Collections.shuffle(random);
        if(longest < shortest || shortest > longest){
            System.out.println("Wrong input format. Must follow syntax \"n, shortest, longest\"");
            return null;
        }
        System.out.println("Attempting to randomly choose " + n + " words between lengths of " + shortest + " and " + longest + "...");
        int k = 0;
        int j = 0;

        while(k < n){
            if(random.get(j).length() >= shortest && random.get(j).length() <= longest){
                result.add(random.get(j));
                j++;
                k++;
            }else{
                j++;
                continue;
            }
        }

        Collections.sort(result, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

        if(result.isEmpty() == true){
            System.out.println("Sorry, this dictionary does not have any words between " + shortest + " and " + longest);
        }else{
            for(int i = 0; i < n; i++){
                System.out.println(result.get(i));
            }
        }
        System.out.println(break);
        return null;
    }
}
