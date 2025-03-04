class Solution {
    public String solution(String my_string, int n) {
        String words = "";
        for(int i = 0; i< my_string.length(); i++){
            for(int j = 0; j < n; j++){
                words += my_string.charAt(i);
            }
        }
        return words;
    }
}