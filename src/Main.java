import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double avgTime_ms = 0.0;

        int N = 3;
        for (int i=0; i<N; ++i) {

            long startTime = System.nanoTime();

            // how long does it take to sum up 0.1 a million times?
            float sum = 0.0F;
            for (int j=0; j<1000000; ++j) {
                sum += 0.000001F;
            }

            long endTime = System.nanoTime();
            long diffTime = endTime - startTime;

            System.out.println( "\tsum = " + sum );

            // get the difference in milliseconds
            avgTime_ms += diffTime / 1000000.0;
        }

        avgTime_ms = avgTime_ms / (float)N;
        System.out.println( "Average time: " + avgTime_ms + " ms" );

    }
}

