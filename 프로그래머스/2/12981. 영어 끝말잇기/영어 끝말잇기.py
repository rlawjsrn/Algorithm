def solution(n, words):
    answer = [0, 0]
    s = set()
    s.add(words[0])

    for i in range(1, len(words)):
        if words[i] in s or words[i - 1][-1] != words[i][0]:
            answer[0] = n if (i + 1) % n == 0 else (i % n) + 1
            answer[1] = i // n + 1
            break
        s.add(words[i])

    return answer
