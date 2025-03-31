import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i < n+1; i++){
            if(i%2 == 0){
                continue;
            }else{
                answer.add(i);
            }
        }
        return answer;
    }
}