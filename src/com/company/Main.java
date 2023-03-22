package com.company;

import com.company.BST.BST_Binary;

public class Main {

    public static void main(String[] args) {
        BST_Binary bst = new BST_Binary();
        /* BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50   */
        //insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(50);
        bst.insert(90);
        bst.insert(20);
        bst.insert(55);
        //print the BST
        System.out.println("BST Được tạo bằng dữ liệu đầu vào (Trái-phải):");
        bst.inorder();

        //delete leaf node
        System.out.println("\nBST sau khi xóa 12(nút node):");
        bst.deleteKey(12);
        bst.inorder();
        //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        //delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        //search a key in the BST
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("\nKey 12 found in BST:" + ret_val );
    }
}