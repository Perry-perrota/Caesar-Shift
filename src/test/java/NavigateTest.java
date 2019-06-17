import org.junit.Test;

import static org.junit.Assert.*;

public class NavigateTest {
@Test
    public void decodeString_checkInputTypes_typeOf(int selection){
    Navigate testNavigate=new Navigate(selection);
    assertEquals(2,testNavigate.getSelection());
}
}