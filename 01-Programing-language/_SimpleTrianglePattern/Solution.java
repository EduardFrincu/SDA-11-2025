
public class Solution {
    public static void main(String[] args) {
        int n =5;

        printTriangle(n);
    }

    public static void printTriangle(int n){
        int element = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(element++ + " ");

            }
            System.out.println();
        }
    }
}
