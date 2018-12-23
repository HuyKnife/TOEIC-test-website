import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MyBigNumberTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();


    MyBigNumber myBigNumber = new MyBigNumber();

    @org.junit.Test
    public void sum() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("123", "456");
        assertEquals("579", s);
    }

    @org.junit.Test
    public void sum2() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1235", "856");
        assertEquals("2091", s);
    }

    @org.junit.Test
    public void sum3() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("100", "900");
        assertEquals("1000", s);
    }

    @org.junit.Test
    public void sum4() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "111");
        assertEquals("1110", s);
    }

    @org.junit.Test
    public void sum5() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "1111");
        assertEquals("2110", s);
    }

    @org.junit.Test
    public void sum6() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1234567890", "4");
        assertEquals("1234567894", s);
    }

    @org.junit.Test
    public void sum7() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum8() {
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("4", "");
        assertEquals("4", s);
    }
}
