package KB;

import org.w3c.dom.Node;

public class Node1 {

    // Node 클래스 정의 (static으로 바깥에 선언)
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public class Main {
        static void dfs(Node root) {
            if(root == null){
                return;
            }
            System.out.println(root.value);
            dfs(root.left);
            dfs(root.right);
        }

        
    // main 메서드
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);

        dfs(root);  // DFS 호출
    }
}

}
