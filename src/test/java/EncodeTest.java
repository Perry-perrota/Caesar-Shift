import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void encodeString_ifInstanceOfclassEncode_String(){
        Encode testEncode=new Encode();
        assertEquals(true,testEncode instanceof Encode);

    }

    }

