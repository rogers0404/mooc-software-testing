package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void gHappyTestEvenGs(){
        GHappy nx = new GHappy();
        boolean result = nx.gHappy("ggxxxggx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyTestOddGs(){
        GHappy nx = new GHappy();
        boolean result = nx.gHappy("ggxxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyTestMoreG(){
        GHappy nx = new GHappy();
        boolean result = nx.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
