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
public class RemoveIngredientTest {

    private Burger burger;

    @Mock
    private Ingredient ingredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }


    @Test
    public void removeIngredientTest() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);

        int expectedCountOfIngredientsAfterRemove = 0;
        int actualCountOfIngredientsAfterRemove = burger.ingredients.size();
        Assert.assertEquals(expectedCountOfIngredientsAfterRemove, actualCountOfIngredientsAfterRemove);
    }
}
