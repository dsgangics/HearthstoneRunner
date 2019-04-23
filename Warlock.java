package hearthstone;

public class Warlock extends Hero{
    
    //constructor
    public Warlock(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 7, Dmg 1, Draw 1
        int arr[] = {7, 1, 1};
        return arr;       
    }
}
