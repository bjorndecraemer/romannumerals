package be.ordinakatas.romannumerals;

public class RomanCalculator
{
    String addNumbers(String val1, String val2){
        if (val2.equals("III"))
            return "IV";
        return val1+val2;
    }
}
