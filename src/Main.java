import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList< Integer > data = new ArrayList<>();

        // First need to create a PRNG engine
        Random prng = new Random();

        // generate 1000 elements between -1000 and 1000
        int N = 1000;
        for (int i=0; i<N; ++i) {
            data.add( prng.nextInt(-1000, 1000) );
        }

        Collections.sort( data );

        System.out.println("Amount of elements: " + data.size() );
        for ( Integer n : data ) {
            System.out.println( "Item: " + n );
        }

    }
}

