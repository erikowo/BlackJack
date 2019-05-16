import sun.security.provider.ConfigFile;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        deck1.initialDeck();

        Player player = new Player();

        Spike spike = new Spike();
        Scanner in = new Scanner(System.in);

        boolean play = true;
        boolean comDraw = false;
        boolean decision = true;
        boolean draw = true;


        System.out.println("Welcome! " + player.getName());
        while (play) {
                if (!comDraw && !draw) {
                    if (player.getPoints() > 21) {
                        System.out.println(player.getName() + " lost!");
                    } else if (spike.getPoints() > 21) {
                        System.out.println(player.getName() + " wins!");
                    } else if (spike.getPoints() == player.getPoints()) {
                        System.out.println("Tie!");
                    } else if (spike.getPoints() > player.getPoints()) {
                        System.out.println(player.getName() + " lost!");
                    } else if (spike.getPoints() < player.getPoints()) {
                        System.out.println(player.getName() + " wins!");
                    }

                    System.out.println("You still want to play? Yes(1) No(2) ");
                    int temp = in.nextInt();
                    if (temp == 1) {
                        play = true;
                    } else if (temp == 2) {
                        play = false;
                        break;
                    }

                    if (play) {
                        player.resetPlayerDeck();
                        player.resetPoints();
                        spike.resetPoints();
                        spike.resetComDeck();
                        draw = true;
                        comDraw = true;
                    }
                }
                //System.out.println("************************");
                System.out.println();
                System.out.println("Now your point is: " + player.getPoints());
                if (draw) {
                    System.out.println("Do you want to draw? yes(1) no(2) ");
                    System.out.println("Or do you want to see your deck(3)? ");
                }

                if (draw) {
                    while (decision) {
                        int temp = in.nextInt();
                        if (temp == 1) {
                            player.draw(deck1);
                            if (player.getPoints() > 21) {
                                //System.out.println(player.getName() + " lost!");
                                draw = false;
                                break;
                            }
                            break;
                        } else if (temp == 3) {
                            player.showDeck();
                        } else if (temp == 2) {
                            draw = false;
                            break;
                        } else {
                            System.out.println("Please input the right number!");
                        }
                        System.out.println("Do you want to draw? yes(1) no(2) ");
                        System.out.println("Or do you want to see your deck(3)? ");
                    }
                }

                comDraw = spike.drawOrNot(deck1);
                if (comDraw) {
                    spike.draw(deck1);
                } else {
                    System.out.println("Spike give up drawing! ");
                }

                //System.out.println();
                //System.out.println("************************");

        }

    }
}
