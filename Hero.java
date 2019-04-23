package hearthstone;

abstract class Hero {

    int health;
    String heroPower;

    //constructor
    public Hero(int h, String hp) {
        health = h;
        heroPower = hp;
    }

    //each hero has a unique ability
    abstract int[] heroPower();

    //set the starting hero's hp through each puzzle
    public void setHeroHP(int hp) {
        health = hp;
    }

}
