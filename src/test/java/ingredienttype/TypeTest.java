package ingredienttype;

import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

import java.util.Arrays;

public class TypeTest {


    @Test
    public void ingredientTypeClassTest() {

        String actual = Arrays.toString(IngredientType.values());
        String expected = Arrays.toString(new String[]{"SAUCE", "FILLING"});
        Assert.assertEquals("Something wrong with the enum", expected , actual);
    }

}

