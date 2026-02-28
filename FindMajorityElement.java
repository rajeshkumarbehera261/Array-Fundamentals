import java.util.HashMap;

public class FindMajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,3,2,5,2,2,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
              
        }
        for (int i : map.keySet()) {
            if(map.get(i)> arr.length/2){
                System.out.println("The majority element is: "+ i);
            }
        }
    }
}