import java.util.Stack;

public class TreeTraverse {
    public void preTraverse(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.getValue());

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    public void midTraverse(TreeNode treeNode) {

        Stack<TreeNode> stack = new Stack<>();
        while(treeNode != null || !stack.empty())
        {
            while (treeNode != null)
            {
                stack.push(treeNode);
                treeNode = treeNode.getLeft();
            }
            if(!stack.empty())
            {
                treeNode = stack.pop();
                System.out.print(treeNode.getValue() + "   ");
                treeNode = treeNode.getRight();
            }
        }

    }

    public void posTraverse(TreeNode treeNode){
        System.out.println();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int i = 1;
        while(treeNode != null || !stack1.empty())
        {
            while (treeNode != null)
            {
                stack1.push(treeNode);
                stack2.push(0);
                treeNode = treeNode.getLeft();
            }

            while(!stack1.empty() && stack2.peek() == i)
            {
                stack2.pop();
                System.out.print(stack1.pop().getValue() + "   ");
            }

            if(!stack1.empty())
            {
                stack2.pop();
                stack2.push(1);
                treeNode = stack1.peek();
                treeNode = treeNode.getRight();
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        node5.setLeft(node8);
        node5.setRight(node9);

        TreeTraverse traverse = new TreeTraverse();
        //traverse.preTraverse(node1);
        traverse.midTraverse(node1);
        traverse.posTraverse(node1);
    }
}
