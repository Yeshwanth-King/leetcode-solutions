class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        newset = list(set(nums))
        if(len(newset) != len(nums)):
            return True
        
        return False
        