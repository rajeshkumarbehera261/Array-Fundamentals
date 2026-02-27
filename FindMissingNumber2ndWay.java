public class FindMissingNumber2ndWay {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int n = arr.length+1;
        int xorArray =0;
        int xorAll = 0;

        for(int i =1; i<= n; i++){
            xorAll ^= i; // 1^2^3^4^5^6
        }

        for(int num: arr){
            xorArray ^= num; //// 1^3^4^5^6
        }
        System.out.println(xorAll^xorArray); //1^2^3^4^5^6 ^ 1^3^4^5^6 cancel out except single num
    }
}