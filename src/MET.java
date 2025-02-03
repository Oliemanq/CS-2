public class MET {
    private int Met;
    private double weight;
    private double duration;

    public MET(int Met, double weight, double duration) {
        this.Met = Met;
        this.weight = weight;
        this.duration = duration;
    }

    public double calculateCaloriesBurned() {
        return Met * weight * duration;
    }
}
