public class Main {
    public static void main(String[] args) {
        Weather[] weathers = new Weather[7];
        weathers[0] = new Weather(70, 50, 10, false);
        weathers[1] = new Weather(75, 55, 12, true);
        weathers[2] = new Weather(80, 60, 15, false);
        weathers[3] = new Weather(85, 65, 20, true);
        weathers[4] = new Weather(90, 70, 25, false);
        weathers[5] = new Weather(95, 75, 30, true);
        weathers[6] = new Weather(100, 80, 35, false);

        

        Station station = new Station(weathers);

        Predictions predictions = new Predictions(station.getWeathers());

        System.out.println("Average Temperature (F): " + predictions.getAvgTempFar());
        System.out.println("Average Humidity: " + predictions.getAvgHumidity());
        System.out.println("Average Wind Speed: " + predictions.getAvgWindSpeed());
        System.out.println("Will it rain? " + predictions.getAvgRain());
    }
}

