class Solution {
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>res = new ArrayList<>();
        if (root==null)return res;
        TreeMap<Integer, TreeMap<Integer,List<Integer>>>nodesSorted = new TreeMap<>();
        dfs(root,nodesSorted,0,0);
        
        for (Map.Entry<Integer, TreeMap<Integer,List<Integer>>>entry: nodesSorted.entrySet()){
            List<Integer>currentList = new ArrayList<>();
            for (Map.Entry<Integer,List<Integer>>currentEntry: entry.getValue().entrySet()){
                Collections.sort(currentEntry.getValue());
                currentList.addAll(currentEntry.getValue());
            }
            res.add(currentList);
        }
        return res;

    }
    
    public void dfs(TreeNode root, TreeMap<Integer, TreeMap<Integer,List<Integer>>>nodesSorted, int level, int order){
        if (root!=null){
            nodesSorted.putIfAbsent(order, new TreeMap<>());
            nodesSorted.get(order).putIfAbsent(level,new ArrayList<Integer>());
            
            nodesSorted.get(order).get(level).add(root.val);
            dfs(root.left, nodesSorted, level+1, order-1);
            dfs(root.right, nodesSorted, level+1, order+1);
        }
    }
}