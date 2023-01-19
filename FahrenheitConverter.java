package converters;

public class FahrenheitConverter extends TemperatureConverter {
    private double convertToFahrenheit(String input) {
        char last = input.charAt(input.length() - 1);
        Integer temp = Integer.parseInt(input.substring(0, input.length() - 1));
        double ans = 0;
        switch (last) {
            case 'F':
                ans = temp;
                break;
            case 'C':
                ans = temp * 1.8 + 32;
                break;
            case 'K':
                ans =  (temp - 273.15) * 1.8 + 32;
                break;
        }
        return ans;
    }
    public FahrenheitConverter(String input) {
        super(input, "Fahrenheit");
        super.setResult(convertToFahrenheit(input));
    }
}