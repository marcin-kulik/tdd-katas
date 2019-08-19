package bowling.game;

public class BowlingGameUncleBob2 {

    private int score = 0;
    
    public void roll(int pins) {
        score +=  pins;
    }

    public int score() {
        return score;
    }

}
