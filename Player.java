import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    private String name;
    private int points = 0;
    private LinkedList<Card> playerDeck = new LinkedList<>();

    public Player() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String temp = in.nextLine();
        this.name = temp;
    }

    public void draw(Deck deck) {
        System.out.println("Drawing card...");
        Card temp = deck.draw();
        playerDeck.add(temp);
        System.out.println("The card you draw is: " + temp.getName());
        this.points = this.points + temp.getPoints();
        System.out.println("Now your points is: " + this.points);
    }

    public int getPoints() {
        return points;
    }

    public void showDeck() {
        Iterator<Card> it = this.playerDeck.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void resetPoints() {
        this.points = 0;
    }

    public void resetPlayerDeck() {
        this.playerDeck = new LinkedList<>();
    }
}
