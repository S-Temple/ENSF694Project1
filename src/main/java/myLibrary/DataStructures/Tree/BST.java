package myLibrary.DataStructures.Tree;

public class BST {

    // Create node

    // Insert new node in BST - you can use recursive or iterative method
    public Node insert(int data, Node root) {
        // when empty
        if (root == null) return new Node(data);
        if (data < root.data) {
            root.left = insert(data, root.left);
        } else root.right = insert(data, root.right);

        return root;
    }

    // Inorder traversal - recursive OR iterative
    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Preorder traversal - recursive OR iterative
    public void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Postorder traversal - recursive OR iterative
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // Breadth first traversal - recursive OR iterative
    public void breadthFirstTraversal(Node root) {
        BST_NodeQueue queue = new BST_NodeQueue(100);
        queue.enqueue(root);
        Node current;
        while (queue.size != 0) {
            current = queue.dequeue();
            System.out.print(current.data + " ");
            if (current.left != null) queue.enqueue(current.left);
            if (current.right != null) queue.enqueue(current.right);
        }
    }

    // Search in BST
    public Node searchBinarySearchTree(Node node, int key) {
        if (node == null) return null;
        if (node.data == key) return node;
        else if (node.data > key) return searchBinarySearchTree(node.left, key);
        else return searchBinarySearchTree(node.right, key);
    }


    // Delete from BST
    public Node deleteNode(Node root, int key) {
        if (root == null) return null;

        Node pointer = root;
        Node parent = null;
        BST_NodeQueue queue = new BST_NodeQueue(20);
        queue.enqueue(pointer);

        while (pointer != null) {
            if (pointer.data == key) {
                if (pointer.right == null && pointer.left == null) {
                    // Leaf node
                    if (parent != null) {
                        if (parent.left == pointer) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    } else {
                        // Root is the only node in the tree
                        root = null;
                    }
                } else if (pointer.right == null) {
                    // Only left child exists
                    if (parent != null) {
                        if (parent.left == pointer) {
                            parent.left = pointer.left;
                        } else {
                            parent.right = pointer.left;
                        }
                    } else {
                        // Root with only left child
                        root = pointer.left;
                    }
                } else if (pointer.left == null) {
                    // Only right child exists
                    if (parent != null) {
                        if (parent.left == pointer) {
                            parent.left = pointer.right;
                        } else {
                            parent.right = pointer.right;
                        }
                    } else {
                        // Root with only right child
                        root = pointer.right;
                    }
                } else {
                    // Double child case
                    Node successorParent = pointer;
                    Node successor = pointer.right;
                    while (successor.left != null) {
                        successorParent = successor;
                        successor = successor.left;
                    }

                    pointer.data = successor.data;
                    if (successorParent.left == successor) {
                        successorParent.left = successor.right;
                    } else {
                        successorParent.right = successor.right;
                    }
                }
                return root;
            } else if (pointer.data > key) {
                parent = pointer;
                pointer = pointer.left;
            } else {
                parent = pointer;
                pointer = pointer.right;
            }
        }
        // Key not found or empty tree
        return root;
    }

    // Add any other parts needed

}
