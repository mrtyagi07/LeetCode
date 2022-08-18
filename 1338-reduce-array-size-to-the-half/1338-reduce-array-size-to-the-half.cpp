class Solution {
    static const int MAX = 100000;
public:
    int minSetSize(vector<int>& arr) {        
        int freq[MAX+1]{}, freqBuckets[MAX+1]{}, ans = 0, maxFreq = 0;
        for(auto num : arr) maxFreq = max(maxFreq, ++freq[num]); 
        for(int i = 0; i <= MAX; i++) freqBuckets[freq[i]]++;   
        for(int i = maxFreq, deleteRequired = size(arr) / 2; deleteRequired > 0; i--) {
            if(!freqBuckets[i]) continue; 
            int noOfFreqToDelete = min(freqBuckets[i], deleteRequired / i + (deleteRequired % i > 0)); 
            deleteRequired -= i * noOfFreqToDelete; 
            ans += noOfFreqToDelete;                             
        }   
        return ans;
    }
};