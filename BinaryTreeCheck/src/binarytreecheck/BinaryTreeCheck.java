
package binarytreecheck;

class Node {
        int data;
        Node left;
        Node right;
     }

public class BinaryTreeCheck {

    boolean checkBST(Node root) {
        return checkBT(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkBT(Node root, int min, int max) {
        if (root == null)
            return true;
        return (min < root.data && root.data < max) && 
            checkBT(root.left, min, root.data) && checkBT(root.right, root.data, max);
    }
    
}
