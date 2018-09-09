/**
 * 移除元素
 *
 * @author ShenYunWen
 **/
public class RemoveElement {
    public int func(int[] nums, int val) {
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.print(removeElement.func(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

}
