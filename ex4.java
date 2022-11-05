public class ex4 {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,2,3,0,4,2 };
        int result = removeElement(nums, 2);
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
        