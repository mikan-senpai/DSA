
# def divisibleSumPairs(num, k, arr):
#     # Write your code here
#     count = 0
#     for element in range(0,num):
#         sum = 0
#         if element > len(arr)-2:
#             break
#         if arr[element]<arr[element+1] and (arr[element]+arr[element+1])% k == 0:
#             count+=1
#     return count 


def divisibleSumPair(num,k , arr):
    arr.sort()
    count = 0
    for i in range(0,num):
        for j in range(i+1,num):
            sum = arr[i]+arr[j]
            if sum % k == 0:
                count+=1
                sum = 0
    print(count)




divisibleSumPair(6,3,[1,3,2,6,1,2])