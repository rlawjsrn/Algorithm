import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int answer = 0;
        
        for(int i = 0; i < scoville.length; i++){
            q.add(scoville[i]);
        }
        
        while(q.element() < K){
            if(q.size() == 1){
                return -1;
            }
            q.add(q.poll() + q.poll()*2);
            answer += 1;
        }
        return answer;
    }
}