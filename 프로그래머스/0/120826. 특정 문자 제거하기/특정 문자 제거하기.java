import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char target = letter.charAt(0);
        for (char str : my_string.toCharArray()) {
		    if(str == target){
                continue;
            }
            else{
                answer += str;
            }
		}
        return answer;
    }
}