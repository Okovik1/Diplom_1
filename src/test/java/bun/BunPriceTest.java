package bun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class BunPriceTest {


    private final float PRICE;
    private final boolean EXPECTED;

    public BunPriceTest(float price, boolean EXPECTED) {
        this.PRICE = price;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] BunTest() {
        return new Object[][]{
                {3.4f, true},
                {0.0f, true}
        };
    }

    @Test
    public void bunPriceTest() {
        Bun bun = new Bun("Test", PRICE);
        boolean actual = bun.getPrice() == PRICE;
        assertEquals(EXPECTED, actual);

    }
}
