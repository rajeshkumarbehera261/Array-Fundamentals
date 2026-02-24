import java.util.*;

public class FindDuplicatesElements {

    /* public static void main(String[] args) {
        
        int[] arr = new int[]{2,2,2,2};

        boolean[] temp = new boolean[arr.length];
        for(int i=0; i<arr.length-1; i++){
            if(temp[i]){
                continue;
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && !temp[j]){
                    System.out.print(arr[j]+" ");
                    temp[j] = true;
                    break;
                }
            }
        }
    } */
    //using HashSet
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2,4,5,8,28,1,1,14,8};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for(int num: arr){
            if(!seen.add(num)){ //HashSet.add() returns:true → if the element was NOT already present (successfully added)
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
    //Using HashMap
    /* public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2,4,5,8,28,1,1,14,8};
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num: arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            
        }
        for(int num: map.keySet()){
            if(map.get(num)>1){
                System.out.print(num+" ");
            }
        }
        
    }     */
} 