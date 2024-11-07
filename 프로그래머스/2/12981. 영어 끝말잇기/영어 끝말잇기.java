import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();   
        set.add(words[0]); // set에 첫 번째 단어 저장
        int[] answer = new int[2];
        
        for(int i = 1; i < words.length; i++){
            if(set.contains(words[i]) || (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))){
                if((i+1)%n == 0){
                    answer[0] = n;
                }else{
                    answer[0] = (i+1)%n;    
                }
                answer[1] = i/n+1;
                break;
            }
            else{
                set.add(words[i]);
                answer[0] = 0;
                answer[1] = 0;
            }    
        }
        
        return answer;
    }
}