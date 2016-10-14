package butte.emily.casinoproject;

/**
 * Created by emilybutte on 10/14/16.
 */
public class BlackjackHand extends Hand {

    public int getBlackjackValue() {
        int handValue;
        boolean ace;  // true if the hand contains an ace.
        int numCards;

        handValue = 0;
        ace = false;
        numCards = getCardCount();

        for (int i = 0; i < numCards; i++) {
            Card card;
            int cardVal;
            card = getCard(i);
            cardVal = card.getValue();
            if (cardVal > 10) {
                cardVal = 10;
            }
            if (cardVal == 1) {
                ace = true;
            }
            handValue = handValue + cardVal;
        }

        if (ace == true && handValue + 10 <= 21)
            handValue = handValue + 10;

        return handValue;

    }
}

