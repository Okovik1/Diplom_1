package ingredienttype;

import org.junit.Test;
import praktikum.IngredientType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TypeTest {


    @Test
    public void ingredientTypeClassTest() {

        String actualType = Arrays.toString(IngredientType.values());
        String expectedType = Arrays.toString(new String[]{"SAUCE", "FILLING"});
        assertEquals("Incorrect enum", expectedType, actualType);
    }

}

