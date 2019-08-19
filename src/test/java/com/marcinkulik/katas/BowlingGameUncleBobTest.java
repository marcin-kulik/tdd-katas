package com.marcinkulik.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.marcinkulik.katas.BowlingGameUncleBob;

public class BowlingGameUncleBobTest {

    private BowlingGameUncleBob game;
    
    
    @BeforeEach
    protected void setUp() throws Exception{
        game = new BowlingGameUncleBob();
    }
    
    
    @Test
    public void testGutterGame() throws Exception{
        rollMany(20,0);
        assertEquals(0, game.score());
    }
    
    @Test
    public void testAllOnes() throws Exception{
        rollMany(20,1);
        assertEquals(20, game.score());
    }
    
    @Test
    public void testOneSpare() throws Exception{
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16, game.score());
    }
    
    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24, game.score());
    }
    
    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12,10);
        assertEquals(300, game.score());
    }

    
    private void rollMany(int n, int pins) {
        for(int i = 0; i < n; i++) {
            game.roll(pins);
        }        
    }
    
    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
    
    private void rollStrike() {
        game.roll(10);
    }

}
