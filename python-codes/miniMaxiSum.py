def miniMaxSum(arr):
    # Write your code here
    arr.sort()
    mini = 0
    for i in range(0,4):
        mini = mini + arr[i]
        
    maxi = (mini - arr[0]) + arr[len(arr)-1];
    
    print(mini,maxi)

miniMaxSum([5,4,3,2,1])

