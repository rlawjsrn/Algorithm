import java.util.*;
class Solution {
    public int solution(int n, int t) {
        int total = n;
        for(int i = 0; i < t; i++){
            total *= 2;
        }
        return total;
    }
}