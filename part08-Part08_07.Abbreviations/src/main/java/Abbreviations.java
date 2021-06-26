
import java.util.HashMap;


public class Abbreviations {
    private HashMap<String,String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String abbr = sanitizedString(abbreviation);
        String expl = sanitizedString(explanation);
        
        if (hasAbbreviation(abbr)) {
            System.out.println("already in library");
        } else {
            abbreviations.put(abbr, expl);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    } 
    
    public String findExplanationFor(String abbreviation) {
        String abbr = sanitizedString(abbreviation);
        return this.abbreviations.get(abbr);
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string  = string.toLowerCase();
        return string.trim();
    }
}
