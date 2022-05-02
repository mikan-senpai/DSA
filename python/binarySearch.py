

def binarySearch(arr, target):
    s=0
    e=len(arr)-1
    mid=0
    while s <= e:
        mid=s+(e-s)//2;
        if arr[mid]==target:
            return mid
        elif arr[mid]<target:
            s=mid+1
        else:
            e=mid-1

    return -1



#test array

arr=[2,3,4,5,6,7]
target =22

#function call
result = binarySearch(arr,target)

print(result)

#heythisisproggrammd by mikan
