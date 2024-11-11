import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0); // 시작은 인덱스 0, 합계 0에서 시작
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int index, int sum){
        // 모든 숫자를 사용한 경우, 합이 타겟과 같다면 answer를 증가
        if(index == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        
        // 현재 숫자를 더하거나 빼는 두 가지 경우의 수를 재귀 호출
       dfs(numbers, target, index + 1, sum + numbers[index]);
       dfs(numbers, target, index + 1, sum - numbers[index]);
    }    
}