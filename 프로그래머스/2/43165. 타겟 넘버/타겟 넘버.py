answer = 0

def solution(numbers : list, target : int) :
	global answer
	dfs(numbers, target, 0, 0)
	return answer

def dfs(numbers : list, target : int, index : int, sum : int):
	global answer
	if index == len(numbers):
		if sum == target:
			answer += 1
		return
	
	dfs(numbers, target, index + 1, sum + numbers[index])
	dfs(numbers, target, index + 1, sum - numbers[index])