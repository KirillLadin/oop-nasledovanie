package converters;

public class KelvinConverter extends TemperatureConverter {
    private double convertToKelvin(String input) {
        char last = input.charAt(input.length() - 1);
        Integer temp = Integer.parseInt(input.substring(0, input.length() - 1));
        double ans = 0;
        switch (last) {
            case 'F':
                ans = (temp - 32) * (5/9) + 273.15;
                break;
            case 'C':
                ans = temp + 273.15;
                break;
            case 'K':
                ans = temp;
                break;
        }
        return ans;
    }
    public KelvinConverter(String input) {
        super(input, "Kelvin");
        super.setResult(convertToKelvin(input));
    }
}