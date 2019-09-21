import java.io.*;
import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        System.out.println("============= Starting ===============");

        int[] arr = {5, 10, 15, 8, 27, 19, 55, 22, 37};

        int searchEle = 15;

        int i;
        for (i = 0; i < arr.length; i++) {
            if(searchEle == arr[i] ) {
                System.out.println("Found");
                break;
            }
        }
        if( i == arr.length ) {
            System.out.println("Not found");
        }
    }
}