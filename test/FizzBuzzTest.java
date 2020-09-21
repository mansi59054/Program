import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void test1() {
        FizzBuzz test1 = new FizzBuzz();
        String result = test1.function1(10);
        assertEquals("Fizz", result);            //This testcase fails, Buzz should come
    }

    @Test
    public void test2() {
        FizzBuzz test2 = new FizzBuzz();
        String result = test2.function1(13);    //Passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test3() {
        FizzBuzz test3 = new FizzBuzz();
        String result = test3.function1(15);    //Passes
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void test4() {
        FizzBuzz test4 = new FizzBuzz();        //fails
        String result = test4.function1(1);
        assertEquals("Fizz", result);
    }

    @Test
    public void test5() {
        FizzBuzz test5 = new FizzBuzz();
        String result = test5.function1(1); //passes
        assertEquals("1", result);
    }

    @Test
    public void test6() {
        FizzBuzz test6 = new FizzBuzz();
        String result = test6.function1(3); //passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test7() {
        FizzBuzz test7 = new FizzBuzz();
        String result = test7.function1(5);
        assertEquals("Buzz", result);    //passes
    }

    @Test
    public void test8() {
        FizzBuzz test8 = new FizzBuzz();
        String result = test8.function1(6); //passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test9() {
        FizzBuzz test9 = new FizzBuzz();
        String result = test9.function1(9); //fail
        assertEquals("Buzz", result);
    }

    @Test
    public void test10() {
        FizzBuzz test10 = new FizzBuzz();
        String result = test10.function1(9); //passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test11() {
        FizzBuzz test11 = new FizzBuzz();
        String result = test11.function1(12); //fails
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void test12() {
        FizzBuzz test12 = new FizzBuzz();
        String result = test12.function1(9); //passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test13() {
        FizzBuzz test13 = new FizzBuzz();
        String result = test13.function1(12); //passes
        assertEquals("Fizz", result);
    }

    @Test
    public void test14() {
        FizzBuzz test14 = new FizzBuzz();        //fails
        String result = test14.function1(1);
        assertEquals("1", result);
    }

}