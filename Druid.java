package hearthstone;

public class Druid extends Hero{
    
    public Druid(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 1, Amour 1, Face Atk 1
        int arr[] = {1, 1, 1};
        return arr;       
    }
}
