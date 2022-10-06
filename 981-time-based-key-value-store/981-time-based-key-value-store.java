class TimeMap {
HashMap<String, TreeMap<Integer, String>> map;

public TimeMap() {
    map = new HashMap<>();
}

public void set(String key, String value, int timestamp) {
    if(!map.containsKey(key)){
        map.put(key, new TreeMap<Integer, String>());
    }

    TreeMap<Integer, String> tmap = map.get(key);
    tmap.put(timestamp, value);
}

public String get(String key, int timestamp) {
    TreeMap<Integer, String> tmap = map.get(key);

    if(tmap==null) return "";

    Integer timekey = tmap.floorKey(timestamp);

    if(tmap.get(timestamp)!=null){
        return tmap.get(timestamp);
    } else if(timekey!=null) {
        return tmap.get(timekey);
    } else {
        return "";
    }
    
}
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */