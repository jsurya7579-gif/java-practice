class Node{
    String data;
    Node left;
    Node right;

    Node(String data){
        this.data = data;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    
    void preorder(Node node){
        if(node!= null){
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
        }
    }

    void inorder(Node node){
        if(node != null){
        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
        }
    }

    void postorder(Node node){
        if(node != null){
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node("p1");
        tree.root.left = new Node("p2");
        tree.root.right = new Node("p3");
        tree.root.left.left = new Node("p4");
        tree.root.left.right = new Node("p5");
        tree.root.right.left = new Node("p6");
        tree.root.right.right = new Node("p7");

        System.out.println("\n pre-order traversaal:");
        tree.preorder(tree.root);

        System.out.println("\n in-order traversal:");
        tree.inorder(tree.root);

        System.out.println("\n post-order traversal:");
        tree.postorder(tree.root);
    }
}
