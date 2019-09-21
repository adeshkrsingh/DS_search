import java.io.*;
import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        /* sorted Array */
        int[] arr = {18, 27, 29, 38, 39, 42, 46, 49, 55, 66, 85, 86, 91, 99};
        int searchEle = 46;

        int left =0, right = arr.length;
        int mid;
        while(left <= right) {
            mid = (left + right) / 2;
            if(searchEle == arr[mid]) {
                System.out.println("Found");
                break;
            } else if(searchEle < arr[mid]) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        if(left > right) {
            System.out.print("Not Found");
        }
    }
}