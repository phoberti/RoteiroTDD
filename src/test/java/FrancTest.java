import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }











}