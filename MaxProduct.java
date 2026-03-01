public class MaxProduct {

    public static void main(String[] args) {
        int arr[] = {2,11,0,1,4,5};

        int currentProduct = arr[0];
        int maxProduct = arr[0];

        for (int i =1; i<arr.length; i++) {
            currentProduct = Math.max(arr[i],arr[i]*currentProduct);
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        System.out.println("Maximum product is: "+maxProduct);
    }
}