
// 1752. Check if Array Is Sorted and Rotated
public class Main {
    public static boolean check(int[] nums) {
        int count = 0; // to find the drop in the array
        for (int i = 0; i < nums.length-1; i++) {
             // Compare nums[i] and nums[i + 1]
            if (nums[i] > nums[i+1]) {
                // A drop is found
                count++;
            }
        }
        // Compare last and first element
        if (nums[nums.length-1] > nums[0]) {
            count++;
        }
        
        return count <= 1;
    }
    
    public static void main(String[] args) {
        // int[] nums = {3, 4, 1, 2};
        int[] nums = {2, 1, 3, 4};
        boolean ans = check(nums);
        System.out.println(ans);
    }
}