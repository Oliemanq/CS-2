public class Station {
    private final Weather[] weathers;

    public Station(Weather[] weathers) {
        this.weathers = weathers;
    }
    public Station(){
        this.weathers = null;
    }


    public Weather[] getWeathers() {
        if (weathers == null) {
            System.out.println("No weather data available.");
            return new Weather[0];
        }
        return weathers;
    }
}
