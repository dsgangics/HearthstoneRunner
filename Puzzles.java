package hearthstone;

abstract public class Puzzles{
    protected Puzzles levels[][] = new Puzzles[4][7];
    
    public Puzzles(){
        for(int i = 0; i < 4; i++){
            for(int a = 0; a < 7; a++){
                if(i == 0){
                    levels[i][a] = new Lethal();
                }else if(i == 1){
                    levels[i][a] = new Mirror();
                }else if(i == 2){
                    levels[i][a] = new BoardClear();
                }else if(i == 3){
                    levels[i][a] = new Survival();
                }
            }
        }
    }
    
    
}
