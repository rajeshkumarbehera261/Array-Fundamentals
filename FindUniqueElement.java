public class FindUniqueElement {
    //constraint: Every element of an array appears twice except one element
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,4,3,2,1,1,5,5};
        int result = 0;
        for(int num : arr){
            result = result ^ num; // a ^ a = 0 , a ^ 0 = a
        }
        System.out.println(result);
    }
}
