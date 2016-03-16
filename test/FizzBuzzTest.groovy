import org.junit.Test

import static junit.framework.Assert.assertEquals

class FizzBuzzTest {

    @Test
    void passingANumberToFizzBuzzReturnsTheNumber() {
        FizzBuzz b = new FizzBuzz()
        assertEquals(1, b.fizzBuzz(1))
    }
}
