package burger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


public class MoveIngredientTest {

    private Burger burger;

    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void moveIngredientTest() {

        for (int i = 0; i != 3; i++) {
            burger.addIngredient(new Ingredient(IngredientType.FILLING, "White sweet bun" + 1, 3.2f));
        }
        Ingredient expected = new Ingredient(IngredientType.SAUCE, "Black bun", 3.4f);
        burger.addIngredient(expected);
        burger.moveIngredient(3, 0);
        Ingredient actual = burger.ingredients.get(0);
        Assert.assertEquals(expected, actual);
    }
}
