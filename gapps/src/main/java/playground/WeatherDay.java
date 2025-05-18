package playground;

public class WeatherDay {
    private double year;
    private double temperature;
    private double maxTemp;
    private double minTemp;
    private double rainfall;
    private double humidity;
    private double windSpeed;
    private double solarRadiation;

    public WeatherDay(double year, double temperature, double maxTemp, double minTemp,
                       double rainfall, double humidity, double windSpeed, double solarRadiation) {
        this.year = year;
        this.temperature = temperature;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.rainfall = rainfall;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.solarRadiation = solarRadiation;
    }

    // Getters and setters
    public double getYear() {
        return year;
    }

    public void setYear(int dayOfYear) {
        this.year = dayOfYear;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getSolarRadiation() {
        return solarRadiation;
    }

    public void setSolarRadiation(double solarRadiation) {
        this.solarRadiation = solarRadiation;
    }
    public double[] toFeatureArray(){
        double[] data = new double[5];
        data[0] = this.temperature;
        data[1] = this.rainfall;
        data[2] = this.windSpeed;
        data[3] = this.humidity;
        data[4] = this.solarRadiation;
        return data;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "dayOfYear=" + year +
                ", temperature=" + temperature +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", rainfall=" + rainfall +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", solarRadiation=" + solarRadiation +
                '}';
    }
}
