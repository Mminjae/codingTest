class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 기본 종료 조건:
        // 1. 현재 노드가 null인 경우 (트리 끝에 도달)
        // 2. 현재 노드가 p 또는 q인 경우 (찾고자 하는 노드를 발견)
        if (root == null || root == p || root == q) {
            return root;
        }

        // 왼쪽 서브트리에서 LCA 탐색
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // 오른쪽 서브트리에서 LCA 탐색
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 만약 왼쪽과 오른쪽에서 각각 p와 q를 찾은 경우
        // 현재 root가 공통 조상
        if (left != null && right != null) {
            return root;
        }

        // 둘 중 하나만 null이 아닌 경우 => null이 아닌 쪽을 위로 리턴
        // (p와 q 중 하나 또는 둘 다 해당 서브트리에 있다는 의미)
        return (left != null) ? left : right;
    }
}
