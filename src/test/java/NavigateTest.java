import org.junit.Test;

import static org.junit.Assert.*;

public class NavigateTest {


    @Test
    public void getmWord_returntypeIfString_String() {
        Navigate testGetMWord=new Navigate(1,3,"");
       String testWord = "";
        assertEquals(true,testGetMWord.getmWord() instanceof String);
    }
    @Test
    public void getmKey_returnTypeIfInt_Integer(){
        Navigate testGetMKey=new Navigate(1,8,"");
        Integer key=8;
        assertEquals(true, key instanceof Integer);
    }
    }

