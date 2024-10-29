import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
		int last = -1;
		for (int a : arr) {
			if (last == a)
				continue;
			last = a;
			list.add(a);

		}
		return list.stream().mapToInt(Integer::intValue).toArray();
    }
}