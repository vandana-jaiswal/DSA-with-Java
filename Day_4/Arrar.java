import java.util.ArrayList;
class Arrar {
     public static void main(String[] args) {
        int[] x = {1,1,2};
         int i = removeDuplicates(x);
         System.out.println(i);
     }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0 ; i<nums.length; i++){
            if(!ar.contains(nums[i])){
                ar.add(nums[i]);
            }  
        }

        System.out.println(ar);
       
        return ar.size();
    }
}
