package be.ordinakatas.romannumerals;

public class RomanCalculator
{
    String addNumbers(String val1, String val2){
        String sum = val1 + val2;
        return sum.replace("IIII", "IV");
    }
}
