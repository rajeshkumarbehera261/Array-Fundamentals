public class FindMajorityElement2ndWay {
    //Boyer-Moore Voting Algorithm
    
    
    public static void main(String[] args) {
        int arr[] = {4,6,2,3,2,2};

        int candidate = 0;
        int count = 0;
        //finding candidate num
        for(int num: arr){
            if(count == 0){
                candidate = num;
            }   
            count += (num == candidate)? 1:-1;
        }
        // verify( may some case such way that 1,2,3,4)
        count = 0;
        for(int num: arr){
            if(num == candidate){
                count++;
            }
        }
        if(count > arr.length/2){
            System.out.println("The majority element is: "+ candidate);
        }

    }
}