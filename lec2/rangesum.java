package lec2;

public class rangesum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int l =1; 
        int r=3;
        int sum;
        if (l == 0) {
            sum = prefixSum[r];
        } else {
            sum = prefixSum[r] - prefixSum[l - 1];
        }
        System.out.println("Range Sum: " + sum);
    }

    
}
