
package dictionary;

import java.util.HashMap;


public class SaveableDictionary {
    HashMap<String, String> dictionary;

    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }
    
    public String translate(String word) {
        for (String dictWord : dictionary.keySet()) {
            if (word.equals(dictWord)) {
                return dictionary.get(dictWord);
            } else if (dictionary.get(dictWord).equals(word)) {
                return dictWord;
            }
        }
        return null;
    }
    
    
}
