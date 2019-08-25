public class FindTheMedianOfTwoOrderedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int middleStartPos = (int) Math.ceil((nums1.length + nums2.length) / 2.0) - 1;
        int m1 = 0, m2 = 0, i=0, j=0;
        boolean isEnd = false;

        for(int currentPosition = 0; currentPosition<=middleStartPos; currentPosition++){
            if(i >= nums1.length){
               j = j + (middleStartPos - currentPosition);
               m1 = nums2[j++];
               m2 = j >= nums2.length ? m1 : nums2[j];

               isEnd = true;
               break;
            }else if(j >= nums2.length){
                i = i + (middleStartPos - currentPosition);
                m1 = nums1[i++];
                m2 = i >= nums1.length ? m1 : nums1[i];

                isEnd = true;
                break;
            }else {
                m1 = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
            }
        }

        if(!isEnd){
            if(i >= nums1.length){
                m2 = nums2[j];
            }else if(j >= nums2.length){
                m2 = nums1[i];
            }else {
                m2 = nums1[i] <= nums2[j] ? nums1[i] : nums2[j];
            }
        }


        if((nums1.length + nums2.length) % 2 == 0){
            return (m1 + m2)/ 2.0;
        }else {
            return m1;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }


}
