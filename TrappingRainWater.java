public class TrappingRainWater {

    public static void main(String[] args){
        int[] arr = new int[]{3, 0, 2, 0, 4};

        //find left max for each bar
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];

        //find right max for each bar
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i= arr.length-2; i>=0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }   
        int TrapWater = 0;
        for(int i= 0; i<arr.length; i++){
            TrapWater += (Math.min(leftMax[i],rightMax[i])-arr[i]);
        }
        // Calculate TrappedWater
        System.out.println("Trapped water is: "+ TrapWater);
    }
}