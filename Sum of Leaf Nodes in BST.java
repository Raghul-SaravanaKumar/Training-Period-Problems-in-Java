import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    static int sumLeaf(Node root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.data;

        return sumLeaf(root.left) + sumLeaf(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        while (true) {

            int n = sc.nextInt();

            if (n < 1)
                break;

            root = insert(root, n);
        }

        System.out.println(sumLeaf(root));
    }
}
