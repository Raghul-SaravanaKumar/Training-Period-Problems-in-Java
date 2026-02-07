import java.util.*;

public class CRUD {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    static Node update(Node root, int oldKey, int newKey) {
        System.out.println("\nUpdate operation is not yet implemented.");
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int values[] = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        for (int val : values) {
            root = insert(root, val);
        }
      
        System.out.print("BST Inorder Traversal: ");
        inorder(root);
        System.out.println("\nSearch for 90: " + search(root, 90));
        System.out.println("Search for 99: " + search(root, 99)); 
        root = update(root, 40, 45);

        sc.close();
    }
}
