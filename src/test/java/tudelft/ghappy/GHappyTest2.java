package tudelft.ghappy;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.*;
//import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest2 {

    GHappy nx;

    @BeforeEach
        public void initialize(){
            nx = new GHappy();
        }

    @Test
    public void gHappyTestEvenGs(){
        //GHappy nx = new GHappy();
        boolean result = nx.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyTestOddGs(){
        //GHappy nx = new GHappy();
        boolean result = nx.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

}
