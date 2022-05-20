package ingredient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientNameTest {

    private final float PRICE = 3.5f;
    private final String NAME;
    private final IngredientType TYPE = IngredientType.FILLING;
    private final boolean EXPECTED;

    public IngredientNameTest(String name, boolean EXPECTED) {
        this.NAME = name;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] IngredientTest() {
        return new Object[][]{
                {"White sweet bun", true},
                {"Булочка с корицей", true},
                {" ", false},
                {"Очень длинное название сладкой, пышной и самой вкусной булочки с корицей", true},
                {null, false}
        };
    }

    @Test
    public void ingredientNameTest() {
        Ingredient ingredient = new Ingredient(TYPE, NAME, PRICE);
        boolean actual = ingredient.getName().equals(NAME);
        assertEquals(EXPECTED, actual);

    }

}

