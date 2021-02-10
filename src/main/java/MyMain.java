import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list,0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(i == list.size()-1){
            return true;
        }
        else if(list.get(i+1) - list.get(i)<0){
            return false;
        }
        else{
            return isSortedRec(list,i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if(i == arr.length && count == 0){
            return true;
        }
        else if(i == arr.length && count != 0){
            return false;
        }
    
        else if(arr[i] == x){
            return (hasCountCopiesRec(arr, x, count-1, i+1));
        }
        else if(arr[i]!= x){
            return (hasCountCopiesRec(arr, x, count, i+1));
        }
        else{
            return false;
        }
    }

    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {     
        while(lowerBound<=upperBound){
            int middleIndex = lowerBound + (upperBound -lowerBound) / 2;
            if(arr[middleIndex] == num){
                return true;
            }
            else if(num <= arr[middleIndex]){
                return binarySearchRec(arr, num, lowerBound, middleIndex-1);
            }
            else if(num>arr[middleIndex]){
                return binarySearchRec(arr, num, middleIndex+1, upperBound);
            } 
        }
        return false;
        
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
