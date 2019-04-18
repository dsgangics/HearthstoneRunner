package hearthstrone;

abstract class Hero {
    
    int health;
    String heroPower;
    
    //constructor
    public Hero(int h, String hp){
        health = h;
        heroPower = hp;
    }
    
    //each hero has a unique ability
    abstract int[] heroPower();
    

}