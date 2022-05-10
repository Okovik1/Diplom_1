package burger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GetPriceTest {

    private Burger burger;

    @Mock
    private Bun bun;

    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void getPriceTest() {
        float expectedPrice = 3.4f;
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(expectedPrice);
        float actualPrice = burger.getPrice();
        expectedPrice = expectedPrice * 2;
        assertEquals(expectedPrice, actualPrice, 0);
    }
}
