package TestGorilla;

public class NewsHeadlines {
    public static void main(String[] args){
    /*
    Assume that titles are in an array of strings. You need to do the following procedures on it:
    1. Create a single string by concatenating the strings in the array
    2. Delete all numeric symbols from the string
    3. Capitalize the first character of each word in the string
     */

        String[] header = new String[] {"break3in news:","1A 1circle is round!"};
        // "Breaking News: A Circle Is Round!

        String concatenatedStrings = "";

        for(int i=0; i<header.length; i++){
            concatenatedStrings += (header[i].replaceAll("[0-9]", "") + " ");
        }

        String[] words = concatenatedStrings.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<words.length; i++){
            String currentWord = words[i];
            if(currentWord.length() > 0) {
                result.append(Character.toUpperCase(currentWord.charAt(0)) + currentWord.substring(1));
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
