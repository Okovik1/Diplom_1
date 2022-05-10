package ingredient;

import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {

    private final IngredientType TYPE = IngredientType.FILLING;


    @Test
    public void ingredientNameTest(){
        Ingredient ingredient = new Ingredient(TYPE,"Sweet white bun", 3.4f);
        IngredientType actual = ingredient.getType();
        assertEquals(TYPE, actual);

    }
}
