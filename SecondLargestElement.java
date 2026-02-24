public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{2,8,-9,-12,4,3,12};
        
        //Edge case
        if(arr.length==0){
            System.out.println("The array is empty");
            return;
        }
        // fisrt finding largest element
        int LargestElement = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>LargestElement){
                secondLargest = LargestElement;
                LargestElement = num;
            }else if(num>secondLargest && num != LargestElement){
                secondLargest = num;
            }
        }
        System.out.println("Second Largest element is: "+secondLargest);
    }
}