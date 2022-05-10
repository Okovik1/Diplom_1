package ingredient;

import org.junit.Test;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientPriceTest {

    private final float PRICE = 3.5f;
    private final String NAME = "White bun";
    private final IngredientType TYPE = IngredientType.FILLING;


    @Test
    public void ingredientPriceTest(){
        Ingredient ingredient = new Ingredient(TYPE,NAME, PRICE);
        float actual = ingredient.getPrice();
        assertEquals(PRICE, actual, 0.0f);

    }

}
