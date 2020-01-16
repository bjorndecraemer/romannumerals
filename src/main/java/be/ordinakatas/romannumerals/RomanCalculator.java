package be.ordinakatas.romannumerals;

public class RomanCalculator
{
    String addNumbers(String val1, String val2){
        String sum = translateToI(val1) + translateToI(val2);
        sum = sum.replace("IIIIIIIIII", "X");
        sum = sum.replace("IIIII", "V");
        System.out.println(sum);
        sum = sum.replace("IIII", "IV");
        System.out.println(sum);
        return sum.replace("IVI", "V");
    }

    private String translateToI(final String sum) {
       return sum.replace("IV", "IIII")
               .replace("V", "IIIII");
    }
}
