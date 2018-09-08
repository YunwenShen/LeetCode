/**
 * 852.山脉数组的峰顶索引
 *
 *
 * @author ShenYunWen
 **/
public class PeakIndexInMountainArray {
    public int func(int[] A) {
        for (int i=0;i<A.length-1;i++){
            if (i>0 && i< A.length -1 && (A[i]>A[i-1]) && (A[i]>A[i+1])){
                return i;
            }
        }
        return 0;
    }
}
