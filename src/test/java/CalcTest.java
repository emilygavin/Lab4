import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc;

    @BeforeEach
    void setup() {
        calc = new Calc();
    }

    @Test
    void testAdd(){
        assertEquals(9, calc.add(4, 5));
    }

    @Test
    void testSubtract() throws Exception {
        assertEquals(4, calc.subtract(10, 6));
    }

    @Test
    void testMultiply(){
        assertEquals(81, calc.multiply(9,9));
    }

    @Test
    void testDivide(){
        assertEquals(3, calc.divide(9,3));
    }
}