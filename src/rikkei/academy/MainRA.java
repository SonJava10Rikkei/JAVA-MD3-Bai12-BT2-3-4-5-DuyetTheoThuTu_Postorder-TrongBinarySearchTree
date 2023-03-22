package rikkei.academy;

public class MainRA {
    public static void main(String[] args) {
        BST_BanaryRA bstBanaryRA = new BST_BanaryRA();
           /* BST tree example

              27
           /     \
          14      35
         /  \    /  \
        10   19  31  42         */
        //insert data into BST (Chèn dữ liệu)
        bstBanaryRA.insert(27);
        bstBanaryRA.insert(14);
        bstBanaryRA.insert(35);
        bstBanaryRA.insert(10);
        bstBanaryRA.insert(19);
        bstBanaryRA.insert(31);
        bstBanaryRA.insert(42);

        //print the BST
        System.out.println("BST được tạo bằng dữ liệu đầu vào(Trái-Phải)");
        bstBanaryRA.inorder();

        //delete leaf node
        System.out.println("\nBST sau khi xóa 19 (nút node):");
        bstBanaryRA.deleteKey(19);
        bstBanaryRA.inorder();

        //delete the node with one child
        System.out.println("\nThe BST after Delete 35 (node with 1 child):");
        bstBanaryRA.deleteKey(35);
        bstBanaryRA.inorder();

        //delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bstBanaryRA.deleteKey(14);
        bstBanaryRA.inorder();

        //search a key in the BST
        boolean ret_val = bstBanaryRA.search (10);
        System.out.println("\nKey 31 found in BST:" + ret_val );
        ret_val = bstBanaryRA.search (31);
        System.out.println("\nKey 19 found in BST:" + ret_val );

    }
}
