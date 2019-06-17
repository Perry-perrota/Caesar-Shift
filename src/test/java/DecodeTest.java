import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void decodeString_ifInstanceOfclassEncode_String() {
        Decode testDecode = new Decode();
        assertEquals(true, testDecode instanceof Decode);

    }
}