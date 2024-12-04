package test;

import demo.ChangeHistory;
import demo.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HistoryTest {
	private ChangeHistory test;

	@BeforeEach
    void setUp() {
		test = new ChangeHistory();
    	test.add(3.0);
    	test.add(5.0);
    	test.add(1.0);
    }

    @Test
    void testSpace() {
        assertEquals("[3.0, 5.0, 1.0]", test.toString());
    }
    
    @Test
    void testLargest() {
        assertEquals(5.0, test.maxValue());
    }
    
    @Test
    void testSmallest() {
        assertEquals(1.0, test.minValue());
    }
    
    @Test
    void testAverage() {
        assertEquals(3.0, test.average());
    }
}
