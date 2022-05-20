package ingredient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IngredientPriceTest {

    private final float PRICE;
    private final boolean EXPECTED;

    public IngredientPriceTest(float price, boolean EXPECTED) {
        this.PRICE = price;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] IngredientTest() {
        return new Object[][]{
                {3.4f, true},
                {-9, false},
                {0, true},
                {0.0f, true},
                {null, false}
        };
    }

    @Test
    public void ingredientPriceTest(){
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"Sweet white bun", PRICE);
        boolean actual = ingredient.getPrice()==PRICE;
        assertEquals(EXPECTED, actual);
    }

}
