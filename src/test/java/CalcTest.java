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
}