package dictionary;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String fileName;

    public SaveableDictionary(String file) {
        this.fileName = file;
        dictionary = new HashMap<>();
    }

    public boolean load(){
        boolean success = true;
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
        } catch (Exception e) {
            success = false;
        }
        return success;
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
    
    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            this.dictionary.values().remove(word);
        }
    }
    
}
