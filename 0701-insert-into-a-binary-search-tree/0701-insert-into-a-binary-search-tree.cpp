/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        if (root == NULL) return new TreeNode(val);
        TreeNode* cursor = root;
        while (true){
            if (cursor->val <= val){
                if (cursor->right != NULL) cursor = cursor->right;
                else{
                    cursor->right = new TreeNode(val);
                    break;
                }
            }
            else{
                if (cursor->left != NULL) cursor = cursor->left;
                else{
                    cursor->left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
};