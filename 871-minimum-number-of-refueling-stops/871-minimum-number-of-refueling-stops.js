var minRefuelStops = function(target, startFuel, stations) {
    let dp = new Array(stations.length + 1).fill(0);
    dp[0] = startFuel;
    for (let i = 0; i < stations.length; i++) {
        for (let t = i; t >=0 && dp[t] >= stations[i][0]; t--) {
            dp[t + 1] = Math.max(dp[t + 1], dp[t] + stations[i][1])
        }
    }
    for (let i = 0; i <= stations.length; i++) {
        if (dp[i] >= target) return i;
    }
    
    return -1;
};