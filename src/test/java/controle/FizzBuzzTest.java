package controle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        // Cas de test
        assertEquals("1", FizzBuzz.de(1));
        assertEquals("2", FizzBuzz.de(2));
        assertEquals("Fizz", FizzBuzz.de(3));
        assertEquals("4", FizzBuzz.de(4));
        assertEquals("Buzz", FizzBuzz.de(5));
        assertEquals("Fizz", FizzBuzz.de(6));
        assertEquals("7", FizzBuzz.de(7));
        assertEquals("8", FizzBuzz.de(8));
        assertEquals("Fizz", FizzBuzz.de(9));
        assertEquals("Buzz", FizzBuzz.de(10));
        assertEquals("11", FizzBuzz.de(11));
        assertEquals("Fizz", FizzBuzz.de(12));
        assertEquals("13", FizzBuzz.de(13));
        assertEquals("14", FizzBuzz.de(14));
        assertEquals("FizzBuzz", FizzBuzz.de(15));
    }
}