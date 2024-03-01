import java.util.*;

public class SimpleWordDictionary {
      Map<Character, TreeSet<String>> wordsMap;

    public SimpleWordDictionary() {
        wordsMap = new TreeMap<>();
    }

   
    public void addWord(String word) {
        char firstLetter = word.charAt(0);
         TreeSet<String>  letter=wordsMap.get(firstLetter);
         
         if(letter==null)
         {
            letter=new TreeSet<>();
          wordsMap.put(firstLetter,letter);
         }
         letter.add(word);
    }

    
    public void printDictionary() {
        wordsMap.forEach((letter, words) -> {
            System.out.println(letter + "->" + words);
        });
    }

  
    public void printWordsOfLetter(char letter) {
        TreeSet<String> words = wordsMap.getOrDefault(letter, new TreeSet<>());
        if (!words.isEmpty()) {
            System.out.println("Words starting with '" + letter + "': " + words);
        } else {
            System.out.println("No words found for letter '" + letter + "'");
        }
    }

    public static void main(String[] args) {
        SimpleWordDictionary dictionary = new SimpleWordDictionary();
      
        dictionary.addWord("Airplane");
        dictionary.addWord("Butterfly");
         dictionary.addWord("Chocolate");
        dictionary.addWord("Dolphin");
     dictionary.addWord("Elephant");
        dictionary.addWord("Fish");
        dictionary.addWord("goat");
        dictionary.addWord("horse");
        dictionary.addWord("ice");
        dictionary.addWord("jaguar");

        
      
        System.out.println("Dictionary:");
        dictionary.printDictionary();

             if(args.length==1)
             {
             if(args[0].length()==1)
             {
                 String lowerLetter=args[0].toLowerCase();
              char letter= lowerLetter.charAt(0);
            
              dictionary.printWordsOfLetter(letter); 
              }else
              {
                  System.out.println("Invalid Letter");
              }
          }else
          {
          System.out.println("Please Enter one argument");
        }
  
    }
}

