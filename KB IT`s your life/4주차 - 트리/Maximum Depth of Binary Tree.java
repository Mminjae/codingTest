
// 트리 형태가 주어짐
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // 루트가 빈 트리일 경우 깊이는 0
        }

        //왼쪽 서브트리의 최대 깊이
        int leftDepth = maxDepth(root.left);

        // 오른쪽 서브트리의 최대 깊이
        int rightDepth = maxDepth(root.right);

        // 현재 노드를 포함한 최대 깊이
        return Math.max(leftDepth, rightDepth) + 1;
        }
}