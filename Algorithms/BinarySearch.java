import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements to be entered? ");
        int howMany = sc.nextInt();
        int[] arr = new int[howMany];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count++;
            System.out.print("Enter element no."+count+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int target = sc.nextInt();
        int result = search(arr,target);
        if (result == -1){
            System.out.println(target+" has not been found.");
        }
        else{
            result++;
            System.out.println(target+" has been found in position "+result+".");
        }

    }
    //Implementing Binary Search algorithm
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        //Including a condition for the split/compare process to run repeatedly
        while(start <= end){
            if(target > arr[mid]){
                start = mid + 1;
                mid = (start + end) / 2;
            }
            else if(target < arr[mid]){
                end = mid - 1;
                mid = (start + end) / 2;
            }
            else if (arr[mid] == target){
                System.out.println("Found it!");
                return mid;
            }
        }
        //This block will only be reached if the above loop
        //has been exhausted before arr[mid]==target becomes true.
        //Checking if the element has been found using necessary conditions
        if (start > end){
            mid=-1;
        }
        return mid;
    }

}
