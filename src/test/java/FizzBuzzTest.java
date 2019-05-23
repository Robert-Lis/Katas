import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @DisplayName("given number, then message is showed")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, fizz",
            "4, 4",
            "5, buzz",
            "6, fizz",
            "9, fizz",
            "10, buzz",
            "15, fizzbuzz",
            "20, buzz",
            "45, fizzbuzz",
    })
    @ParameterizedTest(name = "given {0}, expected {1}")
    public void test1(Integer numberToCheck, String message){

        assertThat(message).isEqualTo(FizzBuzz.caluate(numberToCheck));

    }
}