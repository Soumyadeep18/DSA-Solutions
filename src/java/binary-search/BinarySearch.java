/*
* @Question https://leetcode.com/problems/binary-search/
* @Level EASY
*/
public class BinarySearch {
    // Time Complexity: O(logN)
    // Space Complexity: O(1)
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Tests
        BinarySearch obj=new BinarySearch();
        System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(obj.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}
