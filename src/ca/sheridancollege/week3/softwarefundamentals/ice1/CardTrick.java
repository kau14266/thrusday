/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Scanner;

public class CardTrick {
    // Modifier: [Ramandeep kaur]
    // Student Number: [991700904]
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; // Create an array to store the magic hand of cards
        Card luckyCard = new Card(); // Create a Card object to represent the user's lucky card

        // Generate random cards for the magic hand
        for (int i = 0; i < magicHand.length; i++) {
            Card cd = new Card(); // Create a new Card object
            cd.setValue((int) (Math.random() * 13) + 1); // Set a random value for the card (1-13)
            cd.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Set a random suit for the card
            magicHand[i] = cd; // Add the card to the magic hand array
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Pick a card suit (0-3): ");
        int suit = scanner.nextInt();

        luckyCard.setValue(value); // Set the value of the user's lucky card
        luckyCard.setSuit(Card.SUITS[suit]); // Set the suit of the user's lucky card

        boolean found = false; // Variable to track if the lucky card is found in the magic hand

        // Search for the lucky card in the magic hand
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) { // Check if the current card matches the lucky card
                found = true; // Set found to true if a match is found
                break; // Exit the loop since the lucky card is found
            }
        }

        // Print the result based on whether the lucky card is found or not
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
