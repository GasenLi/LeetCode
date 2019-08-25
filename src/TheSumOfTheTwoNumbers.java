import java.util.HashMap;

public class TheSumOfTheTwoNumbers {


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int diviation;
        for(int i=0; i<nums.length; i++){
            diviation= target - nums[i];
            if(map.containsKey(diviation)){
                return new int[]{i,map.get(diviation)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("!");
    }





    public static void main(String[] args) {
        int[] a = twoSum(new int[]{7,2,13,4}, 9);

        int b = 3+4;

    }





}
