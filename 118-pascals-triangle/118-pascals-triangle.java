import static java.util.Arrays.asList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> res = new ArrayList<>(numRows);
        res.add(asList(1));
        if (numRows >= 2) {
            res.add(asList(1, 1));
        }
        for (int i=2; i<numRows; i++) {
            final List<Integer> row = new ArrayList<>(i+1);
            final List<Integer> previous_Row = res.get(i-1);
            row.add(1);
            for (int k=1; k<i; k++) {
         final int sum = previous_Row.get(k - 1) + previous_Row.get(k);
                row.add(sum);
            }
            row.add(1);
            res.add(row);
        }
        
        return res;
    }
}