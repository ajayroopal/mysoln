package java8;

public class InOrderPreOrderTree {

        MyTreeNode root;
        static int preIndex = 0;

        /* Recursive function to construct binary of size len from
           Inorder traversal in[] and Preorder traversal pre[].
           Initial values of inStrt and inEnd should be 0 and len -1.
           The function doesn't do any error checking for cases where
           inorder and preorder do not form a tree */
        MyTreeNode buildTree(int in[], int pre[], int inStrt, int inEnd)
        {
            if (inStrt > inEnd)
                return null;

        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
            MyTreeNode tNode = new MyTreeNode(pre[preIndex++]);

            /* If this node has no children then return */
            if (inStrt == inEnd)
                return tNode;

            /* Else find the index of this node in Inorder traversal */
            int inIndex = search(in, inStrt, inEnd, tNode.data);

        /* Using index in Inorder traversal, construct left and
           right subtress */
            tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
            tNode.right = buildTree(in, pre, inIndex + 1, inEnd);

            return tNode;
        }

        /* UTILITY FUNCTIONS */

        /* Function to find index of value in arr[start...end]
         The function assumes that value is present in in[] */
        int search(int arr[], int strt, int end, int value)
        {
            int i;
            for (i = strt; i <= end; i++) {
                if (arr[i] == value)
                    return i;
            }
            return i;
        }

        /* This funtcion is here just to test buildTree() */
        void printInorder(MyTreeNode node)
        {
            if (node == null)
                return;

            /* first recur on left child */
            printInorder(node.left);

            /* then print the data of node */
            System.out.print(node.data + " ");

            /* now recur on right child */
            printInorder(node.right);
        }

        // driver program to test above functions
        public static void main(String args[])
        {
            InOrderPreOrderTree tree = new InOrderPreOrderTree();
            int in[] = new int[] { 4, 2, 5, 1, 6, 3 };
            int pre[] = new int[] { 1, 2, 4, 5, 3, 6 };
            int len = in.length;
            MyTreeNode root = tree.buildTree(in, pre, 0, len - 1);

            // building the tree by printing inorder traversal
            System.out.println("Inorder traversal of constructed tree is : ");
            tree.printInorder(root);
        }
    }


