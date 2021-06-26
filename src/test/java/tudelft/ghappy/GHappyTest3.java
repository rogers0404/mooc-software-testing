package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest3 {

    GHappy nx;

    @BeforeEach
        public void initialize(){
            nx = new GHappy();
        }


    @ParameterizedTest(name="gHappyString={0}, expected={1}")
    @CsvSource({"ggxxxggx, true", "xgxxggxx, false", "xxggxx, true", "xxgxx, false", "xxggyygxx, false" })
    @Test
    public void gHappyTestGs(String gHappyString, boolean expected){
        //GHappy nx = new GHappy();
        boolean result = nx.gHappy(gHappyString);
        Assertions.assertEquals(expected,result);
    }
}
