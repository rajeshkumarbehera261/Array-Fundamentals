public class MovesZerosToEnd {
    //constarint: order of element should be preserved
    public static void main(String[] args) {
        int arr[] = new int[]{0,4,2,0,3,0,0,20,12}; // 4,2,3,20,12,0,0,0
        int j =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
             
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    
}