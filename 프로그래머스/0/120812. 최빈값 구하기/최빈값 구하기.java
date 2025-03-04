import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        
        int maxNum = Collections.max(map.values());
        List<Integer> maxList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxNum){
                maxList.add(entry.getKey());
            }
        }
        
        if(maxList.size() > 1){
            return -1;
        } else{
            return maxList.get(0);
        }
    }
}