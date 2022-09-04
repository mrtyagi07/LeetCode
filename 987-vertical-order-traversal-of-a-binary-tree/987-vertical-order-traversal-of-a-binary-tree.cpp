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
  static vector<vector<int>> verticalTraversal(const TreeNode* root) {
	if (!root) return {};
	vector<vector<int>> ans;
	vector<int> iteratorPos; // To know which ones have been sorted
	const int treeMin = abs(_getMin(root));
	ans.resize(treeMin + 1);
	iteratorPos.resize(treeMin + 1, 0);
	queue<pair<const TreeNode*, int>> q; //dfs
	q.push({root, treeMin});
	while (!q.empty()) {
		const int qSize = static_cast<int>(q.size());
		for (int i = 0; i < qSize; ++i) {
			pair<const TreeNode*, int> pair = q.front();
			q.pop();
			const TreeNode* curr = pair.first;
			const int index = pair.second;
			if (ans.size() == index) {
				iteratorPos.emplace_back(0);
				ans.emplace_back();
			}
			ans[index].emplace_back(curr->val);
			if (curr->left) q.push({curr->left, index - 1});
			if (curr->right) q.push({curr->right, index + 1});
		}
		//Sort the ones added in this last iteration (same horizontal level):
		for (int i = static_cast<int>(ans.size()) - 1; i >= 0; --i) {
			const int lastPos = static_cast<int>(ans[i].size());
			if (iteratorPos[i] != lastPos) {
				sort(ans[i].begin() + iteratorPos[i], ans[i].end());
				iteratorPos[i] = lastPos;
			}
		}
	}
	return ans;
}
	
static int _getMin(const TreeNode* root) {
	const int leftMin = root->left ? _getMin(root->left) - 1 : 0;
	return root->right ? min(leftMin, _getMin(root->right) + 1) : leftMin;
}
};