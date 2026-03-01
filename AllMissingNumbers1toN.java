import java.util.ArrayList;

public class AllMissingNumbers1toN {
    //An array is given 1 to n in unsorted order, find all missing numbers
    //constraint: tc: O(n) , sc : No extra space (except output list)
    public static void main(String[] args) {
        int arr[] = {4,1,2,6,8,2,1,3};

        // mark -ve as visited by reaching out through index of original array
        for(int i= 0;i<arr.length; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index] > 0){
                arr[index] = -arr[index];
            }
        }
        // create an array list to store the result 
        ArrayList<Integer> list = new ArrayList<>();
        //find numbers who are not marked , then add their index+1 to the arrayList
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                list.add(i+1);
            }
        }
        System.out.println("Missing numbers are: "+list);
    }
}