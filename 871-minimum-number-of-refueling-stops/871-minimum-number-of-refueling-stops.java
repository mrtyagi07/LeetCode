class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel >= target) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int i=0,n=stations.length,cnt=0;
        while(true) {
            if(startFuel >= target) return cnt;
            int max=0;
            while(i<n&&stations[i][0]<=startFuel) {
                pq.add(stations[i][1]);
                i++;
            }
            cnt++;
            if(pq.isEmpty()) break;
            startFuel+=pq.poll();
            
        }
        return -1;
    }
}