package bun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class BunNameTest {

    private final String NAME;
    private final boolean EXPECTED;

    public BunNameTest(String name, boolean EXPECTED) {
        this.NAME = name;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] BunTest() {
        return new Object[][]{
                {"White sweet bun", true},
                {"Булочка с корицей", true},
                {" ", false},
                {null, false}
        };
    }

    @Test
    public void bunNameTest() {
        Bun bun = new Bun(NAME, 3.3f);
        boolean actual = bun.getName().equals(NAME);
        assertEquals(EXPECTED, actual);
    }
}
