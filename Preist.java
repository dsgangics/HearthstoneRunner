package hearthstrone;

public class Preist extends Hero{

    //constructor
    public Preist(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 5, Heals 2
        int arr[] = {5, 2};
        return arr;       
    }
}