package burger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


public class AddIngredientTest {

    private Burger burger;


    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void addIngredientTest() {
        Ingredient ingredient1 = new Ingredient(IngredientType.FILLING, "Some bun", 34.f);
        Ingredient ingredient2 = new Ingredient(IngredientType.SAUCE, "Some bun2", 35.3f);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        int expectedCountOfIngredients = 2;
        int actualCountOfIngredients = burger.ingredients.size();
        Assert.assertEquals(expectedCountOfIngredients, actualCountOfIngredients);
    }
}
