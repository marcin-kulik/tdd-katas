package com.marcinkulik.katas;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.marcinkulik.katas.BowlingGameUncleBob2;

public class BowlingGameUncleBobTest2 {
    
    BowlingGameUncleBob2 game;
    
    @BeforeEach
    public void setUp () {
        game = new BowlingGameUncleBob2();
    }
    
    
    @Test
    public void testGutterGame() throws Exception{
        int n = 20;
        int pins = 0;
        for (int i = 0; i < n; i++)
            game.roll(pins);
        assertEquals(0, game.score());
    }
    
    @Test
    public void testAllOnes() throws Exception {
        BowlingGameUncleBob2 game = new BowlingGameUncleBob2();
        for (int i = 0; i < 20; i++)
            game.roll(1);
        assertEquals(20, game.score());
    }
    
    

  }
