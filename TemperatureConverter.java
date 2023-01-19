package converters;

public class TemperatureConverter {
    private String input;
    private String name;
    private double result;
    public String getConversionResult() {
        return this.input + " " + this.name + " " + String.valueOf(this.result);
    }
    protected void setResult(double result){
        this.result = result;
    }
    protected TemperatureConverter(String input, String name) {
        this.input = input;
        this.name = name;
    }
}
