from math import ceil,sqrt

t = int(input())
num = list(map(int, input().split()))
ans = []

for i in num:
  cnt = 0
 
  if i == 1:
    continue
  if i == 2:
    ans.append(i)

  for j in range(2,ceil(sqrt(i))+1):
    if i % j  == 0:
      cnt += 1
  
  if cnt == 0:
    ans.append(i)
  

print(len(ans))
