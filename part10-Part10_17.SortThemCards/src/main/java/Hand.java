
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void print() {
        cards.stream().forEach(System.out::println);
    }

    @Override
    public int compareTo(Hand hand) {
        int sumOfCards = cards.stream()
                .mapToInt(k -> k.getValue())
                .sum();
        int otherSumOfCards = hand.getCards().stream()
                .mapToInt(k -> k.getValue())
                .sum();
        return sumOfCards - otherSumOfCards;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
