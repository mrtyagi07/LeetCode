class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;  i <= 9; i++) {
            dfs(i, n, k, numbers, 0, 0);
        }
        
        int[] result = new int[numbers.size()];
        int j = 0;
        
        for(Integer i : numbers) {
            result[j++] = i;
        }
        
        return result;
    }
    
    void dfs(int num, int n, int k, List<Integer> numbers, int currentNumber, int currentLength) {

        currentNumber += num;
        currentLength += 1;
        
        if(currentLength == n) {
            numbers.add(currentNumber);
            return;
        }
        
        if(num + k < 10) {
            dfs(num + k, n, k, numbers, currentNumber * 10, currentLength);
        }
        
        if(k != 0 && num - k >= 0) {
            dfs(num - k, n, k, numbers, currentNumber * 10, currentLength);
        }
    }
}