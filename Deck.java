import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Deck {
    /*private String[] deck = {"Spade Ace", "Spade 2", "Spade 3", "Spade 4", "Spade 5", "Spade 6", "Spade 7", "Spade 8", "Spade 9", "Spade 10", "Spade Jack", "Spade Queen", "Spade King",
            "Heart Ace", "Heart 2", "Heart 3", "Heart 4", "Heart 5", "Heart 6", "Heart 7", "Heart 8", "Heart 9", "Heart 10", "Heart Jack", "Heart Queen", "Heart King",
            "Club Ace", "Club 2", "Club 3", "Club 4", "Club 5", "Club 6", "Club 7", "Club 8", "Club 9", "Club 10", "Club Jack", "Club Queen", "Club King",
            "Diamond Ace", "Diamond 2", "Diamond 3", "Diamond 4", "Diamond 5", "Diamond 6", "Diamond 7", "Diamond 8", "Diamond 9", "Diamond 10", "Diamond Jack", "Diamond Queen", "Diamond King",
    };

    private int[] deckPoints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
    };*/

    LinkedList<Card> deck = new LinkedList();

    private Card spadeAce = new Card("Spade Ace", 1);
    private Card spade2 = new Card("Spade 2", 2);
    private Card spade3 = new Card("Spade 3", 3);
    private Card spade4 = new Card("Spade 4", 4);
    private Card spade5 = new Card("Spade 5", 5);
    private Card spade6 = new Card("Spade 6", 6);
    private Card spade7 = new Card("Spade 7", 7);
    private Card spade8 = new Card("Spade 8", 8);
    private Card spade9 = new Card("Spade 9", 9);
    private Card spade10 = new Card("Spade 10", 10);
    private Card spadeJack = new Card("Spade Jack", 11);
    private Card spadeQueen = new Card("Spade Queen", 12);
    private Card spadeKing = new Card("Spade King", 13);


    private Card heartAce = new Card("Heart Ace", 1);
    private Card heart2 = new Card("Heart 2", 2);
    private Card heart3 = new Card("Heart 3", 3);
    private Card heart4 = new Card("Heart 4", 4);
    private Card heart5 = new Card("Heart 5", 5);
    private Card heart6 = new Card("Heart 6", 6);
    private Card heart7 = new Card("Heart 7", 7);
    private Card heart8 = new Card("Heart 8", 8);
    private Card heart9 = new Card("Heart 9", 9);
    private Card heart10 = new Card("Heart 10", 10);
    private Card heartJack = new Card("Heart Jack", 11);
    private Card heartQueen = new Card("Heart Queen", 12);
    private Card heartKing = new Card ("Heart King", 13);


    private Card clubAce = new Card ("Club Ace", 1);
    private Card club2 = new Card ("Club 2", 2);
    private Card club3 = new Card ("Club 3", 3);
    private Card club4 = new Card ("Club 4", 4);
    private Card club5 = new Card ("Club 5", 5);
    private Card club6 = new Card ("Club 6", 6);
    private Card club7 = new Card ("Club 7", 7);
    private Card club8 = new Card ("Club 8", 8);
    private Card club9 = new Card ("Club 9", 9);
    private Card club10 = new Card ("Club 10", 10);
    private Card clubJack = new Card ("Club Jack", 11);
    private Card clubQueen = new Card ("Club Queen", 12);
    private Card clubKing = new Card ("Club King", 13);


    private Card diamondAce = new Card ("Diamond Ace", 1);
    private Card diamond2 = new Card ("Diamond 2", 2);
    private Card diamond3 = new Card ("Diamond 3", 3);
    private Card diamond4 = new Card ("Diamond 4", 4);
    private Card diamond5 = new Card ("Diamond 5", 5);
    private Card diamond6 = new Card ("Diamond 6", 6);
    private Card diamond7 = new Card ("Diamond 7", 7);
    private Card diamond8 = new Card ("Diamond 8", 8);
    private Card diamond9 = new Card ("Diamond 9", 9);
    private Card diamond10 = new Card ("Diamond 10", 10);
    private Card diamondJack = new Card ("Diamond Jack", 11);
    private Card diamondQueen = new Card ("Diamond Queen", 12);
    private Card diamondKing = new Card ("Diamond King", 13);
    private Card[] diamondDeck = {diamondAce, diamond2, diamond3, diamond4, diamond5, diamond6, diamond7, diamond8, diamond9, diamond10, diamondJack, diamondQueen, diamondKing};
    private Card[] spadeDeck = {spadeAce, spade2, spade3, spade4, spade5, spade6, spade7, spade8, spade9, spade10, spadeJack, spadeQueen, spadeKing};
    private Card[] clubDeck = {clubAce, club2, club3, club4, club5, club6, club7, club8, club9, club10, clubJack, clubQueen, clubKing};
    private Card[] heartDeck = {heartAce, heart2, heart3, heart4, heart5, heart6, heart7, heart8, heart9, heart10, heartJack, heartQueen, heartKing};


    public void initialDeck() { // Add all cards to a deck.

        int count = 0;
        Iterator it = deck.iterator();

        for (int i = 0; i < spadeDeck.length; i++) {
            deck.add(spadeDeck[i]);
            count ++;
        }

        for (int i = 0; i < heartDeck.length; i++) {
            deck.add(heartDeck[i]);
            count ++;
        }

        for (int i = 0; i < clubDeck.length; i++) {
            deck.add(clubDeck[i]);
            count ++;
        }

        for (int i = 0; i < diamondDeck.length; i++) {
            deck.add(diamondDeck[i]);
            count ++;
        }

    }

    public void showDeck() {
        Iterator<Card> it = deck.iterator();
        while (it.hasNext()) {
            Card temp = it.next();
            System.out.println(temp.getName());
        }
    }

    public int showDeckNum() {
        int totalNum = 0;
        Iterator<Card> it = this.deck.iterator();

        while (it.hasNext()) {
            Card temp = it.next();
            totalNum ++;
        }

        return totalNum;
    }

    public Card draw() {
        boolean reDraw = true;
        int cardNum = (int) (Math.random() * 53);
        Iterator<Card> it = this.deck.iterator();
        Card temp = new Card("Test", 0);

        if (cardNum == 0) {
            cardNum = (int) (Math.random() * 53);
        }

        while (reDraw) {
            try {
                for (int i = 0; i < cardNum; i++) {
                    temp = it.next();
                }

                if (temp.getPoints() != 0) {
                    reDraw = false;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Re-drawing... Our cat has eaten the card! ");
                cardNum = (int) (Math.random() * 53);
            } catch (Exception e) {
                cardNum = (int) (Math.random() * 53);
            }
        }


        it = this.deck.iterator();


        while (it.hasNext()) {
            Card temp2 = it.next();
            if (temp.equals(temp2)) {
                //System.out.println("Removing card: " + temp.getName());
                it.remove();
                break;
            }
        }

        return temp;
    }


}
