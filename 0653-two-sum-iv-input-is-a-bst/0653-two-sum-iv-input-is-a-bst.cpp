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
    bool findTarget(TreeNode* root, int k) {
        vector<int> inorder;
        inOrder(root, inorder);
        int front = 0, back = inorder.size()-1;
        while(front < back){
            if (inorder[front] + inorder[back] > k){
                back--;
            } else if (inorder[front] + inorder[back] < k){
                front++;
            } else {
                return true;
            }
        }
        return false;
    }

    void inOrder(TreeNode* root, vector<int> &inorder){
        if (root == NULL) return;
        inOrder(root->left, inorder); 
        inorder.push_back(root->val);
        inOrder(root->right, inorder);
    }
};