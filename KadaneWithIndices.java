public class KadaneWithIndices { //tc = O(n)

    public static void main(String[] args) {
        int[] arr = new int[]{17,1,0,11};
      
        int currSum = arr[0];
        int maxSum = arr[0];

        int sp = 0;
        int ep = 0;
        int teStart = 0; // This variable is declared for a starting new array
        for(int i=1;i<arr.length;i++){
            
            if(arr[i] > currSum){
                currSum = arr[i];
                teStart = i; // assuming starting a new array
            }else{
                currSum += arr[i]; 
                
            }
            //Key point
            if(currSum > maxSum){
                maxSum = currSum;
                sp = teStart;
                ep = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(sp +" -> "+ep);
    }
}