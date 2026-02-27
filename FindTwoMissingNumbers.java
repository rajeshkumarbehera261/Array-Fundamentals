public class FindTwoMissingNumbers {

    public static void main(String[] args) {
        int arr[] = {2,3,4,4,5,3,2,6};

        //xor all the elements
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        //find right most set bit where bits different in two unique elements
        int setBit = xor & (-xor);
        //separate nums into two groups 
        int num1 = 0;
        int num2 = 0;

        for (int num : arr) {
            if((num & setBit) == 0){
                num1 ^= num;
            }else{
                num2 ^=num;
            }
        }
        System.out.print(num1 +" "+num2);
    }
}