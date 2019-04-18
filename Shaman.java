package hearthstrone;
import java.util.Random;

public class Shaman extends Hero{
    
    //constructor
    public Shaman(int h, String hp){
        super(h, hp);
    }
    
    public int[] heroPower(){//Hero 6, Totem Summoned
        Random rand = new Random();
        int totem = rand.nextInt(4);//Healing Totem - 0, Searing Totem - 1, Stoneclaw Totem - 2, Wrath of Air Totem - 3
        int arr[] = {6, totem};
        return arr;       
    }

}