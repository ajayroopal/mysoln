import java.util.LinkedList;
import java.util.Queue;

public class InOrderTreeTraversal {
    public void inTraversal (MyTree myTree){
        if (myTree == null){
            return;
        }
        inTraversal (myTree.left);
        System.out.println (myTree.value);
        inTraversal (myTree.right);
    }
    void printLevelOrder(MyTree mytree) {
        Queue<MyTree> queue = new LinkedList<MyTree>();
        queue.add(mytree);
        while (!queue.isEmpty()) {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            MyTree tempNode = queue.poll();
            System.out.print(tempNode.value + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

        public static void main (String[] argv){
        MyTree myTree = new MyTree(1);
        myTree.right = new MyTree(2);
        myTree.left = new MyTree(3);
        myTree.left.right = new MyTree(4);
        myTree.left.left = new MyTree(5);
        InOrderTreeTraversal inOrderTreeTraversal = new InOrderTreeTraversal();
        //inOrderTreeTraversal.inTraversal(myTree);
        inOrderTreeTraversal.printLevelOrder(myTree);

    }
}
