package hearthstrone;

public class Hunter extends Hero{

    public Hunter(int h, String hp) {
        super(h, hp);
    }

    public int[] heroPower() {//Hero 2, Target Face
        int arr[] = {2, 1};
        return arr;
    }
}
