class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> ans = new HashSet<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        int i = 0 , j = 0;
       while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                j++;
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
       }

       int[] fin = new int[ans.size()];
        int ind = 0;
        for(var nums: ans){
            fin[ind] = Integer.parseInt(nums.toString());
            ind++;
        }

        return fin;

    }
}