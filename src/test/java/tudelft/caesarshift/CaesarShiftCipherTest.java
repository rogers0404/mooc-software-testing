package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    CaesarShiftCipher csc;

    @BeforeEach
    public void initialize(){
        csc = new CaesarShiftCipher();
    }

    @Test
    public void shiftCaesarCipher(){
        String newMsg = csc.CaesarShiftCipher("world", 5);
        Assertions.assertEquals("btwqi", newMsg);
    }

}
