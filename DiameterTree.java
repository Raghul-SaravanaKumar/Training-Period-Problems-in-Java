public class Trees {
static class Node{
    int data;
    Node left, right;
     Node(int data) {
        this.data = data;
        //left = right = null;
    }
}

 static void inorder(Node root){
    if(root==null)
    return;
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
//4 2 5 1 3
 static void preorder(Node root){
    if(root==null)
    return;
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
//1 2 4 5 3 6

 static void postorder(Node root){
    if(root==null)
    return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");

}
static int height(Node root){
    if(root==null)
    return 0;

    return 1+Math.max(height(root.left), height(root.right));
    //height of tree 3
}
    static int countNodes(Node root){
        if(root==null)
        return 0;

        return 1+countNodes(root.left)+countNodes(root.right);
    }
    //total nodes =6
    static int Diameter(Node root){
        if(root==null)
        return 0;

        int ld=Diameter(root.left);
        int rd=Diameter(root.right);

        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(ld+rh+1, Math.max(ld, rd));
    }

public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(6);
    
    System.out.println("Binary Tree created with root value: " + root.data);

    System.out.print("Inorder Traversal: ");
    inorder(root);
    System.out.println();

    System.out.print("Preorder Traversal: ");
    preorder(root);
    System.out.println();

    System.out.print("Postorder Traversal: ");
    postorder(root);
    System.out.println();

    System.out.println("Diameter of the tree: " + Diameter(root));
}
}
