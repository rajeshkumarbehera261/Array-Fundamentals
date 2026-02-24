public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int[]{4,5,6,2,8,3,70};
        int lp =0;
        int rp = arr.length-1;

        while (lp<rp) {
            int temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] =temp;
            lp++;
            rp--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
