public class Lab3 {
    public Lab3(int x){
        method1(x);
    }

    public void method1(int x) {
        method2(x+2);
    }

    public void method2(int x) {
        method3(x+4);
    }

    public void method3(int x) {
        method4(x+1);
    }

    public void method4(int x) {
        System.out.println("Final method reached with value: " + x);
    }
}

