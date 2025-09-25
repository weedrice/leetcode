import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MTSA {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedList = Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed()).sorted().toList();
        if(mergedList.size() % 2 == 0) {
            return (mergedList.get(mergedList.size()/2) + mergedList.get(mergedList.size()/2 - 1)) / 2.0;
        } else {
            return mergedList.get(mergedList.size()/2);
        }
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays2(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;

        while (left <= right) {
            int cut1 = (left + right) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = cut1 == m ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }
        return 1.0;
    }

}
