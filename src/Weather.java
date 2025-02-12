public class Weather {
    private double tempFar;
    private double tempCel;
    private double humidity;
    private double windSpeed;
    private boolean rain;
    public Weather(double tempFar, double humidity, double windSpeed, boolean rain) {
        this.tempFar = tempFar;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.rain = rain;
        this.tempCel = (tempFar - 32) * 5 / 9;
    }
    //getters
    public double getTempFar() {
        return tempFar;
    }
    public double getTempCel() {
        return tempCel;
    }
    public double getHumidity() {
        return humidity;
    }
    public double getWindSpeed() {
        return windSpeed;
    }
    public boolean getRain() {
        return rain;
    }
    //Setters
    public void setTemp(double tempFar) {
        this.tempFar = tempFar;
        this.tempCel = (tempFar - 32) * 5 / 9;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public void setRain(boolean rain) {
        this.rain = rain;
    }
}
