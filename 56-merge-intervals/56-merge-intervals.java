class Solution {
    public int[][] merge(int[][] intervals) {
        
ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();             
Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
		
        int j=0;
        int k=0;
        for(int i=0;i<intervals.length;i++){
            if(i==0&&j==0){
                list.add(new ArrayList<Integer>());
                list.get(k).add(intervals[i][0]);
                list.get(k).add(intervals[i][1]);
                continue;
            }
            if(list.get(k).get(1)>=intervals[i][0]){
                if(list.get(k).get(0)>=intervals[i][0]){
                    list.get(k).set(0,intervals[i][0]);
                    
                }
                if(list.get(k).get(1)>intervals[i][1])
                    continue;
                list.get(k).set(1,intervals[i][1]);
                
                
            }
            else{
                k++;
                list.add(new ArrayList<Integer>());
                list.get(k).add(intervals[i][0]);
                list.get(k).add(intervals[i][1]);
                
            }
            
            
        }
        int[][]arr=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            arr[i][0]=list.get(i).get(0);
            arr[i][1]=list.get(i).get(1);
        }
            return arr;
        
    }
}