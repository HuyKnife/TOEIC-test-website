import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MyBigNumberTest{

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();


    MyBigNumber myBigNumber =  new MyBigNumber();

    @org.junit.Test
    public void sum() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("123", "456");
        assertEquals("579", s);
    }

    @org.junit.Test
    public void sum2() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1235", "856");
        assertEquals("2091", s);
    }

    @org.junit.Test
    public void sum3() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("100", "900");
        assertEquals("1000", s);
    }

    @org.junit.Test
    public void sum4() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "111");
        assertEquals("1110", s);
    }

    @org.junit.Test
    public void sum5() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "1111");
        assertEquals("2110", s);
    }

    @org.junit.Test
    public void sum6() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1234567890", "4");
        assertEquals("1234567894", s);
    }

    @org.junit.Test
    public void sum8(){
        expectedEx.expect(NumberFormatException.class);
        expectedEx.expectMessage("Chua ho tro so am: -3");
        String s = myBigNumber.sum("-3", "4");
    }

    @org.junit.Test
    public void sum9(){
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sum("3a", "4");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }

    @org.junit.Test
    public void sum10(){
        expectedEx.expect(NumberFormatException.class);
        expectedEx.expectMessage("Chua ho tro so am: -7");
        String s = myBigNumber.sum("3", "-7");
    }

    @org.junit.Test
    public void sum13() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum14() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum(null, "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum15() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum(" ", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum16() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("4", " ");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum17() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("4", "");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum18() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("4", null);
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum19() {
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum(null, null);
        assertEquals("0", s);
    }

    @org.junit.Test
    public void sum20(){
        try {
            MyBigNumberMain test = new MyBigNumberMain();
            MyBigNumber myBigNumber = new MyBigNumber(test);
            String s = myBigNumber.sum("3", "4a");
        } catch (ExNumberFormatException ex) {
            assertEquals("Vi tri thu: 2", ex.getMessage());
        }
    }
}