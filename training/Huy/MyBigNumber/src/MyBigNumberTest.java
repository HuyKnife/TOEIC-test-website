import static org.junit.Assert.*;

public class MyBigNumberTest{

    MyBigNumber myBigNumber =  new MyBigNumber();

    @org.junit.Test
    public void sum() {
        try {
            String s = myBigNumber.sum("123", "456");
            assertEquals("579", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum2(){
        try {
            String s = myBigNumber.sum("1235", "856");
            assertEquals("2091", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum3(){
        try {
            String s = myBigNumber.sum("100", "900");
            assertEquals("1000", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum4(){
        try {
            String s = myBigNumber.sum("999", "111");
            assertEquals("1110", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum5(){
        try {
            String s = myBigNumber.sum("999", "1111");
            assertEquals("2110", s);
        } catch (NullPointerException e) {}
    }

}