/**
 * 数组类算法-移动零
 *
 * @author ShenYunWen
 **/
public class MoveZeroes {

    public void func(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[s] = nums[i];
                s++;
            }
        }

        for (int i = s; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.func(new int[]{0, 0, 1});
    }

}
