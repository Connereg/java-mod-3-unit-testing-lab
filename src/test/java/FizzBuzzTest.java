import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void fizzBuzzStringTestOnlyF() {
       String fResponse = fizzBuzz.fizzBuzzString("f");
       assertEquals("Fizz", fResponse, "Fizzbuzz Outputs Fizz when passed only f");
    }

    @Test
    void fizzBuzzStringTestOnlyB() {
        String bResponse = fizzBuzz.fizzBuzzString("b");
        assertEquals("Buzz", bResponse, "Fizzbuzz Outputs Buzz when passed only b");
    }

    @Test
    void fizzBuzzStringTestBothFB() {
        String fbResponse = fizzBuzz.fizzBuzzString("fb");
        assertEquals("FizzBuzz", fbResponse, "Fizzbuzz Output FizzBuzz when passed fb");
    }

    @Test
    void fizzBuzzStringTestNoMatch() {
        String noMatchResponse = fizzBuzz.fizzBuzzString("Cool");
        assertEquals("Cool", noMatchResponse, "Fizzbuzz Outputs unaltered input string when no match to conditions");
    }

    @Test
    void fizzBuzzStringTestNoInput() {
        String noInputResponse = fizzBuzz.fizzBuzzString("");
        assertEquals("", noInputResponse , "Fizzbuzz Outputs Empty when no input");
    }
}