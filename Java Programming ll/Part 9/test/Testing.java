package test;

import demo.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Testing {
    private Warehouse test;

    @BeforeEach
    void setUp() {
        test = new Warehouse(10);
    }

    @Test
    void testSpace() {
        double spaceLeft = test.howMuchSpaceLeft();
        assertEquals(10, spaceLeft);
    }
    
    @Test
    void testAdd() {
        test.addToWarehouse(2);
        assertEquals(2, test.getBalance());
    }

    @Test
    void testSubtract() {
        assertEquals(0, test.takeFromWarehouse(2));
    }
}
