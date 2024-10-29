n = int(input())
nlst = list(map(int, input().split()))

m = int(input())
mlst = list(map(int, input().split()))

nlst.sort() # nlst 정렬


for num in mlst:
  lt, rt = 0, n-1
  isExist = False         # 값의 존재 여부

  while lt <= rt:
    mid = (lt + rt)//2    # 중간 인덱스 값
    
    if num == nlst[mid]:  # 찾을 값이 nlst[mid]값과 같다면
      isExist = True
      print(1)            # 1 출력
      break               # while문 탈출
    elif num > nlst[mid]: # 찾을 값이 nlist[mid]값 보다 크다면
      lt = mid + 1        # lt 값을 키움
    else:                 # 찾을 값이 nlist[mid]값 보다 작다면
      rt = mid - 1        # rt 값을 줄임  

  if not isExist:         # 값이 존재하지 않다면
    print(0)              # 0 출력