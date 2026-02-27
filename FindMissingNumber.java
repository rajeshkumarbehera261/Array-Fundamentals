public class FindMissingNumber {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,8,9,10};
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        int actualSum = 0;

        for(int i= 0;i<arr.length ; i++){
            actualSum += arr[i];
        }
        System.out.print(Math.abs(sum-actualSum));
    }
}