class Solution {
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<int[]>> ref = new HashMap<>();

        int[] colWidth = helper(root, 0, 0, ref, new int[] {0, 0});

        List<List<Integer>> result = new ArrayList<>();

        VerticalSortComparator comparator = new VerticalSortComparator();

        for (int i = colWidth[0]; i <= colWidth[1]; i++) {
            List<int[]> complex = ref.getOrDefault(i, new ArrayList<int[]>());
            Collections.sort(complex, comparator);

            List<Integer> cur = new ArrayList<>();

            for (int[] c: complex) {
                cur.add(c[0]);
            }

            result.add(cur);
        }

        return result;
    }

    private int[] helper(TreeNode root, int row, int col, Map<Integer, List<int[]>> ref, int[] colWidth) {
        if (root == null) {
            return colWidth;
        }

        List<int[]> curList = null;

        if (ref.containsKey(col)) {
            curList = ref.get(col);
        } else {
            curList = new ArrayList<>();
            ref.put(col, curList);
        }

        curList.add(new int[] {root.val, row});

        if (root.left != null) {
            int[] ret = helper(root.left, row + 1, col - 1, ref, colWidth);
            colWidth[0] = Math.min(col - 1, ret[0]);
        }

        if (root.right != null) {
            int[] ret = helper(root.right, row + 1, col + 1, ref, colWidth);
            colWidth[1] = Math.max(col + 1, ret[1]);;
        }

        return colWidth;
    }
    
}

class VerticalSortComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        if (o1[1] != o2[1]) {
            return o1[1] - o2[1];
        }

        return o1[0] - o2[0];
    }
}