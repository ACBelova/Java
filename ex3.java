
public class ex3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int result = removeElement(nums, 3);
        System.out.println(result);
    }
    public static int removeElement(int [] nums, int val) {
        int k = 0;
           for (int i = 0; i < nums.length; i++) {     
           if (nums[i] != val) {
           nums[k++] = nums[i];
            }
        } 
        return k;
    }
}
        




        