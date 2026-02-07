import java.util.*;
public class CRUD{
    static class Node{
        int data;
        Node left ,right;

        Node(int data) {
            this.data = data;
        }
        
    }
    static Node insert(Node root , int key){
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
   
    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int values [] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<values.length;i++){
            values[i] = sc.nextInt();
        }
        // int [] values = {50,40,20,30,10,70,90,80,60};
        for(int val : values){
            root  = insert(root, val);
        }
            System.out.print("BST Inorder Traversal: ");
            inorder(root);    }
}
