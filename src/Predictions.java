public class Predictions {
    private Weather[] stationsIn;
    private Weather[] newPredictions;
    public Predictions(Weather[] stationsIn) {
        this.stationsIn = stationsIn;
    }

    public void makePredictions(){
        newPredictions = new Weather[stationsIn.length];
        for (int i = 0; i < stationsIn.length; i++) {
            Weather curWeather = new Weather(stationsIn[i]);

        }
    }
}
