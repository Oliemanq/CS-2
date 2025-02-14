public class Predictions {
    private final Weather[] weathersIn;

    private double[] tempsFar;
    private double[] humidities;
    private double[] windSpeeds;
    private boolean[] rains;

    public Predictions(Weather[] weathersIn) {
        this.weathersIn = weathersIn;
        getArrays();
    }

    public void getArrays(){
        for (int i = 0; i < weathersIn.length; i++) {
            tempsFar[i] = weathersIn[i].getTempFar();
            humidities[i] = weathersIn[i].getHumidity();
            windSpeeds[i] = weathersIn[i].getWindSpeed();
            rains[i] = weathersIn[i].getRain();
        }
    }
    public double getAvgTempFar(){
        double sum = 0;
        for (double v : tempsFar) {
            sum += v;
        }
        return sum / tempsFar.length;
    }
    public double getAvgHumidity(){
        double sum = 0;
        for (double humidity : humidities) {
            sum += humidity;
        }
        return sum / humidities.length;
    }
    public double getAvgWindSpeed(){
        double sum = 0;
        for (double windSpeed : windSpeeds) {
            sum += windSpeed;
        }
        return sum / windSpeeds.length;
    }
    public boolean getAvgRain() {
        int sum = 0;
        for (boolean rain : rains) {
            if (rain) {
                sum++;
            }
        }
        return sum > rains.length / 2;
    }
    public Weather getAvgWeather() {
        return new Weather(getAvgTempFar(), getAvgHumidity(), getAvgWindSpeed(), getAvgRain());
    }
}
