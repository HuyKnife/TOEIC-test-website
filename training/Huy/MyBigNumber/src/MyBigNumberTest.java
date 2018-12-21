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

    @org.junit.Test
    public void sum6(){
        try {
            String s = myBigNumber.sum("1234567890", "4");
            assertEquals("1234567894", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum7(){
        String s = myBigNumber.sum("abs", "4");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum8(){
        String s = myBigNumber.sum("-3", "4");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum9(){
        String s = myBigNumber.sum("3", "4asd");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum10(){
        String s = myBigNumber.sum("3", "-7");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum11(){
        String s = myBigNumber.sum("3", "-7asdg");
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void sum12(){
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("3", "-7asdg");
    }

    @org.junit.Test
    public void sum13(){
        try {
            String s = myBigNumber.sum("", "4");
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum14(){
        try {
            String s = myBigNumber.sum(null, "4");
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum15(){
        try {
            String s = myBigNumber.sum(" ", "4");
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum16(){
        try {
            String s = myBigNumber.sum("4", " ");
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum17(){
        try {
            String s = myBigNumber.sum("4", "");
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }

    @org.junit.Test
    public void sum18(){
        try {
            String s = myBigNumber.sum("4", null);
            assertEquals("4", s);
        } catch (NullPointerException e) {}
    }
}