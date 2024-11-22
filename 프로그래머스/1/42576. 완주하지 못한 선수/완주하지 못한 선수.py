def solution(participant, completion):
    dict = {}
    for name in participant:
        dict[name] = dict.get(name, 0) + 1
    
    for name in completion:
        dict[name] -= 1
    
    for name, count in dict.items():
        if count > 0:
            return name