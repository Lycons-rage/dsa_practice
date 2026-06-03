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
    vector<int> rightSideView(TreeNode* root) {
        vector<int> res;
        int lvl = 0;
        recursiveTrav(root, lvl, res);
        return res;
    }

    void recursiveTrav(TreeNode* node, int lvl, vector<int> &res){
        if (node == NULL){
            return;
        }
        if (lvl == res.size()){
            res.push_back(node->val);
        }
        recursiveTrav(node->right, lvl+1, res);
        recursiveTrav(node->left, lvl+1, res);
    }
};