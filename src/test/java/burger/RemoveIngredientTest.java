package burger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


public class RemoveIngredientTest {

    private Burger burger;


    @Before
    public void setUp() {
        burger = new Burger();
    }


    @Test
    public void removeIngredientTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "sweet white bun", 32.9f);
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);

        int expectedCountOfIngredientsAfterRemove = 0;
        int actualCountOfIngredientsAfterRemove = burger.ingredients.size();
        Assert.assertEquals(expectedCountOfIngredientsAfterRemove, actualCountOfIngredientsAfterRemove);
    }
}
