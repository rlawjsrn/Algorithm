def solution(s):
    result = list()
    
    for c in s:
        if c == '(':
            result.append(c)
        else:
            if len(result) == 0:
                return False
            else:
                result.pop()
    return len(result) == 0
    
