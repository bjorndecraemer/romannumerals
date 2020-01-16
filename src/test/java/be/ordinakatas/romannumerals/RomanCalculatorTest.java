package be.ordinakatas.romannumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanCalculatorTest {

    private RomanCalculator romanCalculator = new RomanCalculator();

    @Test
    void addNumbers_IplusI_returnsII() {
        String result = romanCalculator.addNumbers("I","I");
        assertThat(result).isEqualTo("II");
    }
}
