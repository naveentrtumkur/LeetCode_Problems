/*

Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

*/

//Solution using O(n3) brute force approach.
Public class solution
{
 public int countTriangles(int[] nums)
 {
    int len = nums.length;
    int count =0;
    for(int i=0; i< len-2 && nums[i]!=0;i++)
    {
	for(int j=0;j<len-1;j++)
        {
	    for(int k=0;k<len;k++)
	    {
		//Check for the triangle validity.
		if(nums[i]+nums[j] > nums[k] && nums[i]+nums[k] > nums[j] && nums[k]+nums[j] > nums[i])
count++;

}
}
}

return count;
}
}
