package hearthstone;

public class Mirror extends Puzzles{
    public Mirror(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }
    
    public Mirror(){
        super(null, null, null, null, null, null, 0, 0, null, null);
        /*Card[] d = null,ed = null;
        Card[] h = new Card[7],eh = new Card[7];
        Card[] fc = new Card[10],efc = new Card[10];
        int sm = 0,cm = 0;
        Hero aHero = null,eHero = null;
        for(int i = 0; i < 7; i++){
            h[i] = new Card();
            eh[i] = new Card();
        }
        for(int i = 0; i < 10; i++){
            fc[i] = new Card();
            efc[i] = new Card();
        }
        deck = d;
        edeck = ed;
        hand = h;
        ehand = eh;
        fcard = fc;
        efcard = efc;
        startMana = sm;
        currentMana = cm;
        allyHero = aHero;
        enemyHero = eHero;*/
    }
}
