import java.util.Iterator;
import java.util.LinkedList;

public class Spike {
    private String name = "Spike";
    private int points = 0;
    private LinkedList<Card> comDeck = new LinkedList<>();

    public boolean drawOrNot(Deck deck) {
        int safe = 0;
        Iterator<Card> it = deck.deck.iterator();
        while (it.hasNext()) {
            if (this.points + it.next().getPoints() <= 21) {
                safe ++;
            }
        }

        double safeChance = (safe / deck.showDeckNum());
        if (safeChance > 0.3) {
            return true;
        } else {
            return false;
        }
    }

    public void draw (Deck deck) {

            System.out.println("Drawing card...");
            Card temp = deck.draw();
            comDeck.add(temp);
            System.out.println("Spike has got his card!");
            System.out.println();
            this.points = this.points + temp.getPoints();

    }

    public int getPoints() {
        return points;
    }

    public void resetPoints() {
        this.points = 0;
    }

    public void resetComDeck() {
        this.comDeck = new LinkedList<>();
    }
}
