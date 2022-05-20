package ingredient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType TYPE;
    private final boolean EXPECTED;


    public IngredientTypeTest(IngredientType type, boolean EXPECTED) {
        this.TYPE = type;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] IngredientTest() {
        return new Object[][]{
                {IngredientType.FILLING, true},
                {IngredientType.SAUCE, true},
                {null, false}
        };
    }

    @Test
    public void ingredientTypeTest() {
        Ingredient ingredient = new Ingredient(TYPE, "Sweet white bun", 3.4f);
        boolean actual = ingredient.getType().equals(TYPE);
        assertEquals(EXPECTED, actual);

    }
}
