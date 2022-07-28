import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int item){
        data=item;
        right=null;
        left = null;
    }
}
public class BinaryTree{
    Node root;
    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int value){
        root = new Node(value);
    }
    public boolean isEmpty(){
        return(root==null);
    }
    public void inOrderDisplay(Node root){
        if(isEmpty()){
            System.out.println("Tree is empty, nthn to display");
            return;
        }
        //left root right
        inOrderDisplay(root.left);
        System.out.print(root.data+" -> ");
        inOrderDisplay(root.right);
    }
    public void preOrderDisplay(Node root){
        if(isEmpty()){
            System.out.println("Tree is empty, nthn to display");
            return;
        }
        //root left right
        System.out.print(root.data+" -> ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
    }
    public void postOrderDisplay(Node root){
        if(isEmpty()){
            System.out.println("Tree is empty, nthn to display");
            return;
        }
        //left right root
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        System.out.print(root.data+" -> ");
    }
    public Node insertNode(Node root,int item){
        if(isEmpty()){
            root = new Node(item);
            return root;
        }
        if(item<root.data)
            root.left = insertNode(root.left, item);
        else if(item>root.data)
            root.right = insertNode(root.right, item);
        return root;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BinarySearchTree obj = new BinarySearchTree();
        int item;
        while(true){
            System.out.println("1. Insert\n2. In Order\n3.PreOrder\n4.PostOrder");
            System.out.print("Enter ur option : ");
            int op = scn.nextInt();
            switch(op){
                case 1 :
                System.out.print("Enter the item to be inserted : ");
                item = scn.nextInt();
                obj.root = obj.insertNode(obj.root, item);
                break;

                case 2 : 
                obj.inOrderDisplay(obj.root);
                System.out.println();
                break;

                case 3 : 
                obj.preOrderDisplay(obj.root);
                System.out.println();
                break;

                case 4 : 
                obj.postOrderDisplay(obj.root);
                System.out.println();
                break;

                case 5 : 
                return;
                
            }
            scn.close();
        }

    }
}
