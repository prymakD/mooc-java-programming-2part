package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
        dictionary.add("banaani", "banana");

// use the dictionary
        dictionary.save();
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("olut"));
        System.out.println(dictionary.translate("banaani"));
    }
}
