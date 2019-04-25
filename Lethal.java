package hearthstone;

public class Lethal extends Puzzles {
    public Lethal(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }
    
    public Lethal(){
        super(null, null, null, null, null, null, 0, 0, null, null);
    }
}
