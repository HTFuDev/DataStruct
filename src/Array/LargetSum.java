package Array;

public class LargetSum {
    /* Find the larget sum contiguous sub array */
    public static int maxSubArraySum(int[] arr) {
        int size = arr.length;
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int i=0;i<size;i++){
            maxEndingHere= maxEndingHere +arr[i];

            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }

            if(maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
            int[] arr = {1,-2,3,4,-4,6,-4,3,2};
            System.out.println("Largest sum contiguous sub-array " + maxSubArraySum(arr));
    }
}
