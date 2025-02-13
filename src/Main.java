public class Main {
    public static void main(String[] args) {
        Weather[] stations = new Weather[3];
        stations[0] = new Weather(60, 20, 30, true);
        stations[1] = new Weather(45, 25, 35, false);
        stations[2] = new Weather(32, 30, 40, false);

        Predictions predictions = new Predictions(stations);
        predictions.makePredictions();
    }
}

