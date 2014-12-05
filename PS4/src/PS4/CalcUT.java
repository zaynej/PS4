package PS4;

import static org.junit.Assert.*;
import PS4.CalcEngine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcUT {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void FutureValue1() {

        // assertEquals("message", expected value, found value)
        assertEquals("The answer should be $11022.66.", "11022.66",
                PS4.CalcEngine.calculate(10000, 3, 3.25));
    }

    @Test
    public final void FutureValue2() {

        assertEquals("The answer should be $110.47.", "110.47",
        		PS4.CalcEngine.calculate(100, 1, 10));
    }

    @Test
    public final void FutureValue3() {

        assertEquals("The answer should be $1221.2.", "1221.2",
        		PS4.CalcEngine.calculate(1000, 10, 2));
    }
}