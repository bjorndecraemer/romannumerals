package be.ordinakatas.romannumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanCalculatorTest {

    private RomanCalculator romanCalculator = new RomanCalculator();

    @Test
    void addNumbers_IplusI_returnsII() {
        String result = romanCalculator.addNumbers("I", "I");
        assertThat(result).isEqualTo("II");
    }

    @Test
    void addNumbers_IplusII_returnsIII() {
        String result = romanCalculator.addNumbers("I", "II");
        assertThat(result).isEqualTo("III");
    }


    @Test
    void addNumbers_IIplusI_returnsIII() {
        String result = romanCalculator.addNumbers("II", "I");
        assertThat(result).isEqualTo("III");
    }


    @Test
    void addNumbers_IplusIII_returnsIV() {
        String result = romanCalculator.addNumbers("I", "III");
        assertThat(result).isEqualTo("IV");
    }


    @Test
    void addNumbers_IIplusII_returnsIV() {
        String result = romanCalculator.addNumbers("II", "II");
        assertThat(result).isEqualTo("IV");
    }


    @Test
    void addNumbers_IIplusIII_returnsV() {
        String result = romanCalculator.addNumbers("II", "III");
        assertThat(result).isEqualTo("V");
    }


    @Test
    void addNumbers_IVplusI_returnsV() {
        String result = romanCalculator.addNumbers("IV", "I");
        assertThat(result).isEqualTo("V");
    }


    @Test
    void addNumbers_VplusI_returnsVI() {
        String result = romanCalculator.addNumbers("V", "I");
        assertThat(result).isEqualTo("VI");
    }


    @Test
    void addNumbers_IplusV_returnsVI() {
        String result = romanCalculator.addNumbers("I", "V");
        assertThat(result).isEqualTo("VI");
    }


    @Test
    void addNumbers_IVplusIII_returnsVII() {
        String result = romanCalculator.addNumbers("IV", "III");
        assertThat(result).isEqualTo("VII");
    }
}
