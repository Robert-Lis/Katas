import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class WordCheckTest {


    @DisplayName("should compare length of two strings")
    @CsvSource({
            "'MARA', 'RAMA', 'true'",
            "'WARA', 'LOCK', 'true'",
            "'MARA', 'KRAMA', 'false'",
            "'MARA', 'RAMAK', 'false'",

            "'OLA',     'ol',       'false'",
            "'kala',    'lakma',    'false'",
    })
    @ParameterizedTest(name = "given: {0} and {1}; expected: {2}")
    void test0(String str1, String str2, boolean expectedValue) throws Exception {

        //when
        boolean stringComparator = WordCheck.lengthCheck(str1, str2);

        //then
        assertThat(stringComparator).isEqualTo(expectedValue);
    }


    @DisplayName("should compare occurrences of letters in two strings")
    @CsvSource({
            "'MARA', 'RAMA', 'true'",
            "'WARA', 'RAWA', 'true'",
            "'KLARA', 'LARKA', 'true'",
            "'MARA', 'RAMM', 'false'",
            "'WARA', 'WARK', 'false'",
            "'LARKA', 'LERKA', 'false'",
            "'KARMA', 'marka', 'true'",
    })
    @ParameterizedTest(name = "given: {0} and {1}; expected: {2}")
    void test1(String str1, String str2, boolean expectedValue) throws Exception {

        //when
        boolean stringComparator = WordCheck.letterComparison(str1, str2);

        //then
        assertThat(stringComparator).isEqualTo(expectedValue);
    }


    @DisplayName(("should compare length and occurrences of the letters in two strings"))
    @CsvSource({
            "'MARA',    'RAMA',     'true'",
            "'MARk',    'kRAM',     'true'",
            "'OLA',     'ALO',      'true'",
            "'KARMA',   'marka',    'true'",
            "'OLA',     'ol',       'false'",
            "'kala',    'lakma',    'false'",
    })
    @ParameterizedTest(name = "given: {0} and {1}; expected: {2}")
    void test2(String str1, String str2, boolean expectedValue) throws Exception{

        //when
        boolean stringComparator = WordCheck.stringComparison(str1, str2);

        //then
        assertThat(stringComparator).isEqualTo(expectedValue);
    }

}