class Solution {
   public int minSetSize(int[] arr) {
        int len = arr.length;
        //step1: map(num -> freq)
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq=0;
        for(int num : arr ){
            map.put(num, map.getOrDefault(num, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(num));
        }
        //step2 buck sort: int[](freq -> NUM[num1, num2, ...])
        int[] freqArr = new int[maxFreq+1];
        for(int freq : map.values()){
            freqArr[freq]++;
        }
        //step3:
        int res=0, half=len/2, removed=0, curFreq=maxFreq;
        while(removed<half){
            while(freqArr[curFreq]==0) curFreq--;
            freqArr[curFreq]--;
            removed+=curFreq;
            res++;
        }
        return res;
    } 
}