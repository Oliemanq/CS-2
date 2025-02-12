public class Station {
    private Weather[] weathers;
    private Predictions[] predictions;
    private boolean hasPredictions;

    public Station(Weather[] weathers, Predictions[] predictions) {
        this.weathers = weathers;
        this.predictions = predictions;
        this.hasPredictions = true;
    }
    public Station(Weather[] weathers){
        this.weathers = weathers;
        this.hasPredictions = false;
    }

    public Weather[] getWeathers() {
        return weathers;
    }
    public String getWeathersString(){
        var str = "";
        for (Weather weather : weathers) {
            str += (weather.getTempFar() + " " + weather.getTempCel() + " " + weather.getHumidity() + " " + weather.getWindSpeed() + " " + weather.getRain());
        }
        return str;
    }
}
