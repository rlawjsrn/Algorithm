import java.util.*;
class Supo{
    int id;
    int cnt;
    int[] answer;

    public Supo(int id, int cnt, int[] answer) {
        this.id = id;
        this.cnt = cnt;
        this.answer = answer;
    }
}

class Solution {
    public List<Integer> solution(int[] answers) {
        // 수포자 객체 생성
        Supo supo1 = new Supo(1, 0, new int[]{1, 2, 3, 4, 5});
        Supo supo2 = new Supo(2, 0, new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        Supo supo3 = new Supo(3, 0, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
        
        for(int i =0; i<answers.length; i++){
            if(answers[i] == supo1.answer[i%5]){
                supo1.cnt += 1;
            }
            if(answers[i] == supo2.answer[i%8]){
                supo2.cnt += 1;
            }
            if(answers[i] == supo3.answer[i%10]){
                supo3.cnt += 1;
            }
        }
        
        int maxScore = Math.max(supo1.cnt, Math.max(supo2.cnt, supo3.cnt));
        // 정답자 배열
        List<Integer> result = new ArrayList<>();
        
        if(supo1.cnt == maxScore){
            result.add(supo1.id);
        }
        if(supo2.cnt == maxScore){
            result.add(supo2.id);
        }
        if(supo3.cnt == maxScore){
            result.add(supo3.id);
        }
        
        // 결과를 오름차순으로 정렬
        Collections.sort(result);
        
        return result;
    }
}