package ingredient;

import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {

    private final float PRICE = 3.5f;
    private final String NAME = "White bun";
    private final IngredientType TYPE = IngredientType.FILLING;


    @Test
    public void ingredientNameTest(){
        Ingredient ingredient = new Ingredient(TYPE,NAME, PRICE);
        IngredientType actual = ingredient.getType();
        assertEquals(TYPE, actual);

    }
}
