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
    bool isValidBST(TreeNode* root) {
        vector<int> inor;
        inOrder(root, inor);
        if (inor.size() == 1){
            return true;
        }
        for (int i=1; i<inor.size(); i++){
            if (inor[i] <= inor[i-1]){
                return false;
            }
        }
        return true;
    }

    void inOrder(TreeNode* root, vector<int> &inor){
        if (root == NULL){
            return;
        }
        inOrder(root->left, inor);
        inor.push_back(root->val);
        inOrder(root->right, inor);
    }
};