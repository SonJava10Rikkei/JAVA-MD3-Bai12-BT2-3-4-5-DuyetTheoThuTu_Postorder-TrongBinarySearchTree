package com.company.BST;

public class BST_Binary {
    // B2, BST root node
    Node root;

    // B3. Constructor for BST =>initial empty tree
    public BST_Binary() {
        root = null;
    }

    // B6.3 delete a node from BST
    public void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }

    // B6.2 recursive delete function
    Node delete_Recursive(Node root, int key) {
        //tree is empty
        if (root == null) return root;

        //traverse the tree
        if (key < root.key)     //traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else {
            // node contains only one child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    // B6.1
    int minValue(Node root) {
        //initially minval = root
        int minval = root.key;
        //find minval
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // B4.2 insert a node in BST (Chèn)
    public void insert(int key) {
        root = insert_Recursive(root, key);
    }

    // B4.1 recursive insert function (chèn Đệ quy )
    Node insert_Recursive(Node root, int key) {
        //tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    // B5.2 method for inorder traversal of BST (duyệt theo thứ tự BST)
    public void inorder() {
        inorder_Recursive(root);
    }

    // B5.1 recursively traverse the BST (duyệt đệ quy)
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    // B7.2
    public boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null) return true;
        else return false;
    }

    // B7.1 recursive insert function
    Node search_Recursive(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key) return root;
        // val is greater than root's key
        if (root.key > key) return search_Recursive(root.left, key);
        // val is less than root's key
        return search_Recursive(root.right, key);
    }

    // B1 Tạo class Node
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }
}