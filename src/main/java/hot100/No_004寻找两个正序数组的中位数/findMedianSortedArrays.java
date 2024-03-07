package hot100.No_004寻找两个正序数组的中位数;

/**
 * @题目:给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 * @样例：
 * 示例 1：
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 *
 * 示例 2：
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 */


public class findMedianSortedArrays {

    /**
     * @方法一:  1、len = nums1.length + nums2.length 表示总长度
     *          2、直接统计比较两个数组的数字不断留下小的一个，申请一个变量 index 记录总下标
     *          3、当len为奇数时，index == (len-1)/2时，说明已经找到了中位数
     *          4、当len 为偶数的时候，变量在(len-1)/2时赋值给num，再循环一次， index = （len-1）/2+1时 num再加一次后除以2
     *          注意:循环时要判断两个数组是否已经遍历完其中一个 num = num1 == null ? nums2[index2++] : nums1[index1++];
     * @param nums1
     * @param nums2
     * @return
     *
     * @好处： 这样就不用申请新的空间，也不用完全的遍历完两个数组
     */
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        // len表示两个数组的总长度
        int len = nums1.length + nums2.length;
        int index = 0, index1 = 0, index2 = 0;
        double midNum = 0.0;
        while(index < len){
            //获取nums1的数字
            Integer num1 = index1 < nums1.length ? nums1[index1] : null;
            //获取nums2的数字
            Integer num2 = index2 < nums2.length ? nums2[index2] : null;
            int num;
            if(num1 != null && num2 != null){
                num = num1 < num2 ? nums1[index1++] : nums2[index2++];
            }else{
                num = num1 == null ? nums2[index2++] : nums1[index1++];
            }
            if(index == (len - 1)/2){
                if(len % 2 != 0){
                    midNum = num;
                    break;
                }else{
                    midNum += num;
                }
            }else if(index == (len - 1)/2 + 1){
                midNum = (midNum + num) / 2.0;
                break;
            }
            index++;
        }
        return midNum;
    }



    /**
     * @方法二： 最笨的暴力解法(申请一个新数组，合并然后找中间的数)
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[2001];
        double midNum;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                nums3[k] = nums1[i];
                k++;
                i++;
            }else{
                nums3[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i < nums1.length){
            nums3[k] = nums1[i];
            k++;
            i++;
        }
        while(j < nums2.length){
            nums3[k] = nums2[j];
            k++;
            j++;
        }
        if(k % 2 != 0){
            int mid = (k - 1)/2;
            midNum = nums3[mid];
        }else{
            midNum = (double)((nums3[k/2] + nums3[(k/2) - 1]) / 2.0);

        }
        return midNum;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {2, 3};
        int[] nums2 = new int[] {4, 5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
