package converters;

public class CelsiusConverter extends TemperatureConverter {
    private double convertToCelsius(String input) {
        char last = input.charAt(input.length() - 1);
        Integer temp = Integer.parseInt(input.substring(0, input.length() - 1));
        double ans = 0;
        switch (last) {
            case 'F':
                ans = (temp - 32) * (5/9);
                break;
            case 'C':
                ans = temp;
                break;
            case 'K':
                ans =  temp - 273.15;
                break;
        }
        return ans;
    }
    public CelsiusConverter(String input) {
        super(input, "Celsius");
        super.setResult(convertToCelsius(input));
    }
}