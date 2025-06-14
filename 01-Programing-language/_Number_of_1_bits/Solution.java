public class Solution{
    public static int countOnes1(int n){
        int count = 0;

        while(n!=0){
            if((n & 1) == 1){
                count++;
            }

            n = n >>> 1;
        }
        return count;
    }
    // Alternative method using bit manipulation
    public static int countOnes2(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }

            n = n >>> 1;
        }
        
        return count;
    }


    public static int countOnes3(int n){
        int count = 0;
        while(n !=0){
            count++;
            n = n & (n - 1); // This operation reduces the number of 1s by 1 each time
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOnes1(5)); // Output: 2
        System.out.println(countOnes1(21)); // Output: 3
        System.out.println(countOnes1(-128)); // Output: 25
    }

}