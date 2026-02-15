package lec2;

public class equilibrium {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }  
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        for(int i =0;i<n;i++){
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            int rightSum = (i == n - 1) ? 0 : suffixSum[i + 1];
            if(leftSum == rightSum){
                System.out.println("Equilibrium index: " + i);
            }
        }
        System.out.println("Equilibrium index: " + -1);
    }
}
