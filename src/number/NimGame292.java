package number;

/**
 * Created by flyig on 2016/7/16.
 *
 * Question: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 *          Both of you are very clever and have optimal strategies for the game.
 */
public class NimGame292 {

    public boolean canWinNim(int n){
        if (n <= 3){
            return true;
        }
        return n % 4 != 0;
    }
}
