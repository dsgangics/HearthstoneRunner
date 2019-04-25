package hearthstone;

public class HearthstoneRunner {

    public static void main(String[] args) {
        Puzzles[] boardClearLvls = new BoardClear[7];
        Puzzles[] lethalLvls = new Lethal[7];
        Puzzles[] survivalLvls = new Survival[7];
        Puzzles[] mirrorLvls = new Mirror[7];
        
        for(int i = 0; i < 7; i++){
            boardClearLvls[i] = new BoardClear();
            lethalLvls[i] = new Lethal();
            survivalLvls[i] = new Survival();
            mirrorLvls[i] = new Mirror();
        }
    }
    
}
