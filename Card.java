package hearthstone;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Card extends gameDeck{
    public String name;
    public int hp;
    public int attack;
    public boolean taunt;
    public String imagePath;
    
    public Card(String n, int health, int atk, boolean tauntCondition, String image){
        name = n;
        hp = health;
        attack = atk;
        taunt = tauntCondition;
        imagePath = image;
        BufferedImage cardImg = null;
        cardImg= ImageIO.read((new File(image)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isTaunt() {
        return taunt;
    }

    public void setTaunt(boolean taunt) {
        this.taunt = taunt;
    }
    
    
}
