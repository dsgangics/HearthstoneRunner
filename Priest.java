package hearthstone;

public class Priest extends Hero{

    //constructor
    public Priest(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 5, Heals 2
        int[] arr = {5, 2};
        return arr;       
    }
}
