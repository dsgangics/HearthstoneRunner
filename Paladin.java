package hearthstrone;

public class Paladin extends Hero{
    
    //constructor
    public Paladin(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 4
        int arr[] = {4};
        return arr;       
    }
}