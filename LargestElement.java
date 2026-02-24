public class LargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{4};

        //Edge case
        if(arr.length ==0){
            System.out.println("Array is emepty");
            return;
        }

        int largest = Integer.MIN_VALUE ;
        
        for(int num: arr){ //tc = O(n) , sc= O(1)
            if(num>largest){
                largest = num;
            }
        }
        System.out.println("The largest element in the array is: "+largest); 
    }
}