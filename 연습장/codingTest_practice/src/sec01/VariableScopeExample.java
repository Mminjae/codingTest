package sec01;

public class VariableScopeExample {

    public static int fibo(int n){
        if((n == 1) || (n == 2)) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        fibo(10);
    }
}

