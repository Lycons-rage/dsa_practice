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
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        vector<int> inorder(preorder);
        sort(inorder.begin(), inorder.end());
        return buildTree(preorder, inorder);
    }

    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        map<int, int> iMap;
        for (int i = 0; i < inorder.size(); i++){
            iMap[inorder[i]] = i;
        }

        TreeNode* root = buildTree(preorder, 0, preorder.size()-1, inorder, 0, inorder.size()-1, iMap);
        return root;
    }

    TreeNode* buildTree(vector<int> &preorder, int preStart, int preEnd, vector<int> &inorder, int inStart, int inEnd, map<int, int> &iMap){
        if (preStart > preEnd || inStart > inEnd) return NULL;

        TreeNode* root = new TreeNode(preorder[preStart]);
        int inRoot = iMap[root->val];
        int numOfLeft = inRoot - inStart;

        root->left = buildTree(preorder, preStart + 1, preStart + numOfLeft, inorder, inStart, inRoot - 1, iMap);
        root->right = buildTree(preorder, preStart + numOfLeft + 1, preEnd, inorder, inRoot + 1, inEnd, iMap);

        return root;
    }
};