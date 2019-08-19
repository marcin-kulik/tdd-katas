package bowling.game;

public class BowlingGameMine {

    private int rolls[] = new int[21];
    private int currentRoll = 0;
    
    public void roll(int pins) {
        rolls[currentRoll++]= pins;        
    }

    public int score() {
        int score = 0;
        for(int roll =  0; roll < rolls.length  ; roll++) {            
            score+= rolls[roll];
            if(isStrike(roll))
                score+= rolls[roll + 1] + rolls[roll + 2];
            if(isSpare(roll))
                score+= rolls[roll];
        }
        return score;
    }
    
    private boolean isSpare(int roll) {
        return roll>1&&(((rolls[roll-2]) + (rolls[roll-1]))==10);
    }
    
    private boolean isStrike(int roll) {
        return rolls[roll]==10;
    }

}
