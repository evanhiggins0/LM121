# LM121
For assignment 3, we were provided a skeletal "Dictionary.java" file, which would be capable of reading and storing information from a .txt file and then we were tasked with completing the following methods:



<b>void loadWordsFromFile(String filename)</b> {

Reads the words from the specified file and adds them to the dictionary. You should use the include method provided with the class to add the words read from the file. The include method will handle all the work required to add each word.
	

 

<b>boolean spellCheck(String aWord)</b> {

Searches the dictionary for the specified word and returns true if the word is found and false otherwise.
	

 

<b>ArrayList<String> predict(String portion)</b> {

Returns an ArrayList of the words in the dictionary that begin with (or start with) the text specified by the parameter string. Remember, it may be the case that the dictionary does not have words that start with the specified string.
	

 

<b>void display(int wordsPerLine)</b> {

Displays the words in the dictionary. The display should have the specified numbers of words in each line.
	

 

<b>ArrayList<String> NRandomlyChosenWords(int n)</b> {

Randomly selects N words from the dictionary and returns them as an ArrayList. The words should be returned in descending length order (i.e. the longest word selected should be first, then the next longest word, and so on, with the shortest word last).If N is greater than the number of words in the dictionary return ALL the words in the dictionary sorted appropriately.
	

 

<b>ArrayList<String> randomlyChooseNWordsWithLengthsBetween(int n, int shortest, int longest)</b> {)

Randomly selects N words from the dictionary that have lengths between shortest and longest (inclusive). The words should be returned in descending length order (i.e. the longest word selected should be first, then the next longest word, and so on, with the shortest word last).If N is greater than the number of words in the dictionary that are within the specified lengths the method should return whatever words are in the dictionary within the lengths, sorted appropriately of course.
	

I have also provided two .txt files for testing.
