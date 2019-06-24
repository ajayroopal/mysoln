package java8;

public class ConvertToDLL {
    // 'root' - root of binary tree
    MyTreeNode root;

    // 'head' - reference to head node of created
    //double linked list
    MyTreeNode head;

    // A simple recursive function to convert a given
    // Binary tree to Doubly Linked List
    void BToDLL( MyTreeNode root)
    {
        // Base cases
        if (root == null)
            return;

        // Recursively convert right subtree
        BToDLL(root.right);

        // insert root into DLL
        root.right = head;

        // Change left pointer of previous head
        if (head != null)
            (head).left = root;

        // Change head of Doubly linked list
        head = root;

        // Recursively convert left subtree
        BToDLL(root.left);
    }

    // Utility function for printing double linked list.
    void printList (MyTreeNode head)
    {
        System.out.println("Extracted Double Linked List is : ");
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    // Driver program to test the above functions
    public static void main(String[] args)
    {
        /* Constructing below tree
               5
             /   \
            3     6
           / \     \
          1   4     8
         / \       / \
        0   2     7   9  */

        ConvertToDLL tree = new ConvertToDLL();
        tree.root = new MyTreeNode(5);
        tree.root.left = new  MyTreeNode(3);
        tree.root.right = new MyTreeNode(6);
        tree.root.left.right = new MyTreeNode(4);
        tree.root.left.left = new MyTreeNode(1);
        tree.root.right.right = new MyTreeNode(8);
        tree.root.left.left.right = new MyTreeNode(2);
        tree.root.left.left.left = new MyTreeNode(0);
        tree.root.right.right.left = new MyTreeNode(7);
        tree.root.right.right.right = new MyTreeNode(9);

        tree.BToDLL(tree.root);
        tree.printList(tree.head);
    }
}

