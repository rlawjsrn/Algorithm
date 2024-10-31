import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score); // score 오름차순 정렬
        
        int result = 0; // 결과 변수 선언
        
        for(int i = score.length-m; i >= 0; i -= m){
            result += score[i] * m;
        }
        return result;
    }
}