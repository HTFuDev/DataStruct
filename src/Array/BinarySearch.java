package Array;

public class BinarySearch {

    public static int binarySearch(int[] arr, int value){
        int size = arr.length;
        int low = 0;
        int high = size-1;
        int mid;

        while (low<=high){
            mid = (low+high)/2;
            if(arr[mid] == value){
                return mid;
            } else {
                if(arr[mid]<value){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,};
            System.out.println("Binary Search Index for number " + binarySearch(arr,6));
    }
}
