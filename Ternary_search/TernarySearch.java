import java.io.*;
import java.util.*;

class TernarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 25, 27, 29, 34, 35, 37, 39, 45, 48, 49, 50, 51, 52, 58, 60, 65, 68, 69, 70, 75};
        int searchEle = 50;

        int left = 0, right = arr.length;
        int mid1, mid2;

        while(left <= right) {
            mid1 = left + (right - left ) /3;
            mid2 = right - (right - left ) /3;
            //System.out.println("l : " + left + " mid1 : " + mid1 + " mid2 : " + mid2 + " r : " + right);

            if(searchEle == arr[mid1]) {
                System.out.println("Found at mid1");
                break;
            } else if (searchEle == arr[mid2]) {
                System.out.println("Found at mid2");
                break;
            } else if (searchEle < arr[mid1]) {
                right = mid1 -1;
            } else if (searchEle > arr[mid2]) {
                left = right + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }            
        }
        if(left > right) {
            System.out.println("Not Found");
        }
    }
}