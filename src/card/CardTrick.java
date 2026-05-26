/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 * @author srinivsi
 * Modified by: Sahil Thanawala
 * Date modified: 25 May 2026
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);

        Card userCard = new Card();

        System.out.println("Enter card value (1-13):");
        userCard.setValue(input.nextInt());

        System.out.println("Enter suit (Hearts, Diamonds, Spades, Clubs):");
        userCard.setSuit(input.next());

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            
            if (magicHand[i].getValue() == userCard.getValue()
                    && magicHand[i].getSuit().equalsIgnoreCase(userCard.getSuit())) {
                
                found = true;
            }
        }

        if (found) {
            System.out.println("You win! Your card was found.");
        } else {
            System.out.println("You lose. Your card was not found.");
        }
    }
}
