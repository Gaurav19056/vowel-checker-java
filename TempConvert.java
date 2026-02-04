public class TempConvert {
    public static Double convertTemperature(double temp, String unit) {
        if(unit=="C"){
            return (temp * 9 / 5) + 32;
        }else if(unit=="F"){
            return (temp - 32) * 5 / 9;
        }else{
            return null;
        }
    }
    public static void main(String[] args) {
        Double result1 = convertTemperature(25, "C");
        if (result1 != null)
            System.out.println("25°C is " + result1 + "°F");
        Double result2 = convertTemperature(98.6, "F");
        if (result2 != null)
            System.out.println("98.6°F is " + result2 + "°C");
        Double result3 = convertTemperature(0, "C");
        if (result3 != null)
            System.out.println("0°C is " + result3 + "°F");
        Double result4 = convertTemperature(212, "F");
        if (result4 != null)
            System.out.println("212°F is " + result4 + "°C");
        Double result5 = convertTemperature(100, "K");
        if (result5 == null)
            System.out.println("Invalid unit provided.");
        Double result6 = convertTemperature(-40, "C");
        if (result6 != null)
            System.out.println("-40°C is " + result6 + "°F");
        Double result7 = convertTemperature(-40, "F");
        if (result7 != null)
            System.out.println("-40°F is " + result7 + "°C");
    }
}

