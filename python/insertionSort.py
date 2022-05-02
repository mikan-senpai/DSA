def insertionSort(arr):
    size=len(arr)
    for i in range(1,size):
        temp=i
        j=i-1
        while(j>=0 and arr[j] > temp):
            if(arr[j] > temp):
                arr[j+1]=arr[j]
                j=j-1    
            arr[j+1]=temp

            



a=[21,2,45,10,44]
insertionSort(a)


print(str(a))
