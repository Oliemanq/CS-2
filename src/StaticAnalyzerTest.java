public class StaticAnalyzerTest {

    public StaticAnalyzerTest() {
        int result = computeValue();
        System.out.println("Computed value: " + result);

        moreComputation();

        int x = 5;
        if (x == 10) {
            System.out.println("x is 10");
        }

        String str = "";
        for (int i = 0; i < 5; i++) {
            str += i;
        }
        System.out.println(str);

        doSomeMoreComputation(10, 0);
    }

    public int computeValue() {
        return 100;
    }

    public int moreComputation() {
        int a = 10;
        int b = 20;
        return (a+b);
    }

    public void doSomeMoreComputation(int a, int b) {
        System.out.println(a / b);
    }
}

