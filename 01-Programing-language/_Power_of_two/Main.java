public class Main {
    public static void main(String[] args) {
        
        
        int n = 5;

        System.out.println(n * n);
        System.out.println(n >> 1);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;

        //or
        // while(n %2 == 0){
        //     n = n/2;
        // }

        // return n == 1;        
    }
}