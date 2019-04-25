package hearthstone;

public class Mage extends Hero{

    public Mage(int h, String hp) {
        super(h, hp);
    }

    public int[] heroPower() {//Hero 3, dmg 1
        int[] arr = {3, 1};
        return arr;
    }
}
