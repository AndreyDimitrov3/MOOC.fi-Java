package test;

import demo.MainPage;
import demo.Subpage;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Testing {
	private Checker test;

    @BeforeEach
    void setUp() {
    	test = new Checker();
    }
  
    @Test
    void day() {
    	boolean answer = test.isDayOfWeek("fda");
    	assertEquals(false, answer);
    }

    @Test
    void vowels() {
    	boolean answer = test.allVowels("aeio");
    	assertEquals(true, answer);
    }
  
    @Test
    void testReg() {
    	boolean answer = test.timeOfDay("05:08:09");
    	assertEquals(true, answer);
    }
}
