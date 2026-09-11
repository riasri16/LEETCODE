/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, Integer> freq= new HashMap<> ();
    int maxFreq = 0;

    void dfs(TreeNode root) {
        if (root==null) return;
        
        int count =freq.getOrDefault(root.val, 0) + 1;
        freq.put(root.val, count);
        maxFreq = Math.max(maxFreq, count);
        
        dfs(root.left);
        dfs(root.right);
    }

    public int[] findMode(TreeNode root) {
      dfs(root);
        
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
               list.add(entry.getKey());
            }
        }
        // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}