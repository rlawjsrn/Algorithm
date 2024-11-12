import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 각 숫자를 문자열로 변환하여 배열에 저장
        String[] numStrs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrs[i] = String.valueOf(numbers[i]);
        }

        // 문자열 배열을 (X + Y)와 (Y + X) 비교 기준으로 내림차순 정렬
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // a + b와 b + a를 비교하여 더 큰 값이 먼저 오도록 정렬
                return (b + a).compareTo(a + b);
            }
        });

        // 정렬된 문자열을 하나로 결합
        StringBuilder result = new StringBuilder();
        for (String num : numStrs) {
            result.append(num);
        }

        // 만약 모든 값이 "0"인 경우, "0"만 반환
        if (result.toString().startsWith("0")) {
            return "0";
        }

        return result.toString();
    }
}
