class Solution2 {
    public int maxDepth(TreeNode root) {
        int num = 0;
//        if (root.TreeNode)

        return num;
    }
}

// C++版代码
//// struct TreeNode {
////     int val;
////     TreeNode *left;
////     TreeNode *right;
////     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
//// };
//
//class Solution {
//    public:
//    int max_deep = 0, deep = 0;
//    int maxDepth(TreeNode* root) {
//        if (root != NULL){
//            fn(root, 0);
//        }
//        return max_deep;
//    }
//    void fn(TreeNode *node, int deep){
//        deep++;
//        if (node->left == NULL && node->right == NULL){
//            if (deep > max_deep){
//                max_deep = deep;
//            }
//        }
//        if(node->left != NULL){
//            fn(node->left, deep);
//        }if (node->right != NULL){
//            fn(node->right, deep);
//        }
//    }
//};