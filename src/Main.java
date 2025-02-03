import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter MET: ");
        int Met = scanner.nextInt();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter duration in hours: ");
        double duration = scanner.nextDouble();

        MET met = new MET(Met, weight, duration);

        System.out.println("Calories burned is: " + met.calculateCaloriesBurned());
    }
}

