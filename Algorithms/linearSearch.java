import java.util.*;
public class linearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {10, 9, 20, 3, 7};  //random input case
        System.out.println("Enter a number to search: ");
        int num = in.nextInt();  //prompt for an element to be searched
        int count = 0;

        //loop to search for the element

        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                System.out.println(arr[i]+" has been found in position "+i);
                count++;
                break;
            }
        }

        //checkpoint for the absence of the element

        if (count == 0){
            System.out.println("Element "+num+" not found");
        }


    }
}
