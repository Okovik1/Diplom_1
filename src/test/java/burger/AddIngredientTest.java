package burger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;

@RunWith(MockitoJUnitRunner.class)
public class AddIngredientTest {

    private Burger burger;

    @Mock
    private Ingredient ingredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient);
        int expectedCountOfIngredients = 1;
        int actualCountOfIngredients = burger.ingredients.size();
        Assert.assertEquals(expectedCountOfIngredients, actualCountOfIngredients);
    }
}
