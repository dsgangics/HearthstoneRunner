package hearthstrone;

public class Warrior extends Hero{

    //constructor
    public Warrior(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 8, Amour 2
        int arr[] = {8, 2};
        return arr;       
    }
}