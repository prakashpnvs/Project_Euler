package Even_Fibonacci_Numbers;

public class Solution {

    /* Dynamic programming bottom up approach */
    public static int findSumOfEvenValues(int n) {
        int sum = 0;

        int arr[] = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if(arr[i] > 4000000) {
                break;
            }
            if(arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        return sum;

    }


    public static void main(String[] args) {
        /* Take arbitrary number whose fibonacci value would be much greater than 4 million */
        System.out.println(Solution.findSumOfEvenValues(100));
    }
}
