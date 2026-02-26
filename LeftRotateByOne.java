public class LeftRotateByOne {

    public static void main(String[] args) {
        int[] arr = new int[]{4,6,8,3,7};
        int[] temp = new int[arr.length];

        int n = arr.length;
        
        for(int i=0; i< n; i++){
            temp[i] = arr[(i+1)%n];
        }
        for(int num: temp){
            System.out.print(num + " ");
        }
    }
}