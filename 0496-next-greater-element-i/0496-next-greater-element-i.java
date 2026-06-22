class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int iter = nums2.length - 1; iter >= 0; iter--)
        {
            while(st.isEmpty() == false && st.peek() < nums2[iter])
            {
                st.pop();
            }
            if(st.isEmpty() == true)
            {
                map.put(nums2[iter], -1);
            }
            else
            {
                map.put(nums2[iter], st.peek());
            }
            st.push(nums2[iter]);
        }
        int [] result = new int[nums1.length];
        for(int iter = 0; iter < nums1.length; iter++)
        {
            result[iter] = map.get(nums1[iter]);
        }
        return result;
    }
}