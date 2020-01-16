package be.ordinakatas.romannumerals;

public class RomanCalculator
{
    String addNumbers(String val1, String val2){
        if("V".equals(val2)){
            return val2 + val1;
        }
        String sum = val1 + val2;
        System.out.println(sum);
        sum = sum.replace("IIII", "IV");
        System.out.println(sum);
        return sum.replace("IVI", "V");
    }
}
