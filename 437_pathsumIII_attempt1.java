/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int cursum = 0;
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
    
        if(root== null)
            return 0;
        
        cursum = interpathsum(root,sum) + interpathsum(root.left,sum) + interpathsum(root.right,sum);
        return cursum;
    }
       /* if(cursum == sum)
        {
            count++;
            //System.out.println("")
            System.out.println("cursum = "+cursum+"Count val="+count);
            cursum = 0;
        }
        
        
        
        
        return count;*/
        
        
        public int interpathsum(TreeNode root, int sum)
        {
        
        if (root == null) 
         return 0;
            
        if(root.val == sum)
           return 1 + interpathsum(root.left, sum - root.val) + interpathsum(root.right, sum - root.val);
        else
            return interpathsum(root.left, sum - root.val) + interpathsum(root.right, sum - root.val);
            
        }
    
        /*if(root.left!=null)
        {
            System.out.println("left Cursum="+cursum);
            cursum += pathSum(root.left,cursum);
        }
        
        if(root.right!=null)
        {
             System.out.println("Right Cursum="+cursum);
            cursum += pathSum(root.right,cursum);
        }
    
        return sum;
        }
        
        public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumFrom(TreeNode node, int sum) {
        
    }
}*/
    
    
    }
