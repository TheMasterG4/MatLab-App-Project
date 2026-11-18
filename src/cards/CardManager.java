package cards;

public final class CardManager {
    public final Card[] deck = new Card[52];


    public int numberOfDecksInPlay=1;



    public int getCardID(int card){
        return card/numberOfDecksInPlay;
    }





}
