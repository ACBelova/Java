import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.ldap.SortControl;
import javax.print.attribute.standard.NumberUpSupported;

public class ex3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(nums);
        System.out.println(val);
    }
    public int removeElement(int[] nums, int val) {
        int[] expectedNums = { 2, 2 };
        int k = removeElement(nums, val);
        assert k == expectedNums.length;
    }
    public void Sort() {
        Sort (nums,0,k); 
           for (int i = 0; i < nums.length; i++) {     
           if (nums[i] != val) {
           nums[k++] = nums[i];
           }
        }
    } 
    return k;  
    }  
}
        




        