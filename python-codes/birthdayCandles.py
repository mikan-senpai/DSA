# def birthdayCakeCandles(candles):
#     # Write your code here
    
#     candles.sort()
#     l = len(candles)-1
#     count = 0
#     for i in reversed(candles):
#         if candles[l] == i:
#             count +=1
#     return count


# birthdayCakeCandles([3,5,5,4,3,5])



# def birthdayCakeCandles(candles):
#     count=0 
#     a=max(candles) 
#     for i in candles: 
#         if i == a:
#             count+=1
#     print(count)






def birthdayCakeCandles(candles):
    count=0 
    a=max(candles) 
    for i in range(0,len(candles)): 
        if candles[i] == a:
            count+=1
    print(count)


    birthdayCakeCandles([3,5,5,4,3,5])