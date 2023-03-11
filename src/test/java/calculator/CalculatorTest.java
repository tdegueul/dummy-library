package calculator;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void add_two_numbers() {
        assertThat(calc.add(2, 3), is(equalTo(5)));
    }

    @Test
    void add_two_numbers_negative() {
        assertThat(calc.add(2, -3), is(equalTo(-1)));
    }

    @Test
    void substract_two_numbers() {
        assertThat(calc.subtract(3, 2), is(equalTo(1)));
    }

    @Test
    void substract_two_numbers_negative() {
        assertThat(calc.subtract(2, 3), is(equalTo(-1)));
    }

    @Test
    void multiply_two_numbers() {
        assertThat(calc.multiply(2, 3), is(equalTo(6)));
    }

    @Test
    void multiply_two_numbers_negative() {
        assertThat(calc.multiply(2, -3), is(equalTo(-6)));
    }

    @Test
    void divide_two_numbers() {
        assertThat(calc.divide(6, 2), is(equalTo(3f)));
    }

    @Test
    void divide_two_numbers_decimal() {
        assertThat(calc.divide(6, 4), is(equalTo(1.5f)));
    }

    @Test
    void div_two_numbers_zero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(2, 0));
    }
}
