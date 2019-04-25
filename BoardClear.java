package hearthstone;

public class BoardClear extends Puzzles {
    
    public BoardClear(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }
    
    public BoardClear(){
        super(null, null, null, null, null, null, 0, 0, null, null);
    }

    public boolean checkWinCondition() {//checks all enemy minions have been removed
        return true;
    }
}