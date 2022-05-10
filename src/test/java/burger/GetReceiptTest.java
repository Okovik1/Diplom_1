package burger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static junit.framework.TestCase.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class GetReceiptTest {

    private Burger burger;

    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }


    @Test
    public void getReceiptTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        String bunName = "Sweet white bun";
        IngredientType ingredientType = IngredientType.valueOf("SAUCE");
        String ingredientName = "Tomato";
        float expectedPrice = 20f;
        Mockito.when(bun.getName()).thenReturn(bunName);
        Mockito.when(ingredient.getType()).thenReturn(ingredientType);
        Mockito.when(ingredient.getName()).thenReturn(ingredientName);
        Mockito.when(bun.getPrice()).thenReturn(10f);

        StringBuilder template = new StringBuilder(String.format("(==== %s ====)%n", bunName));
        template.append(String.format("= %s %s =%n",ingredientType.toString().toLowerCase(), ingredientName));
        template.append(String.format("(==== %s ====)%n", bunName));
        template.append(String.format("%nPrice: %f%n", expectedPrice));

        String expected = template.toString();

        String actual = burger.getReceipt();

        assertEquals(expected,actual);
    }
}
