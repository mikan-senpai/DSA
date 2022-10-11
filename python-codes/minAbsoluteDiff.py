# Python implementation to find the
# sum of minimum absolute difference
# of each array element

# function to find the sum of
# minimum absolute difference

def sumOfMinAbsDifferences(arr,n):
	# sort the given array
	arr.sort()
	# initialize sum
	sum = 0
		
	# min absolute difference for
	# the 1st array element
	sum += abs(arr[0] - arr[1]);
		
	# min absolute difference for
	# the last array element
	sum += abs(arr[n - 1] - arr[n - 2]);
		
	# find min absolute difference for
	# rest of the array elements and
	# add them to sum
	for i in range(1, n - 1):
		sum += min(abs(arr[i] - arr[i - 1]),
				abs(arr[i] - arr[i + 1]))
			
	# required sum
	return sum;
		

# Driver code
arr = [12, 10, 15, 22, 21, 20, 1, 8, 9]
n = len(arr)
print( "Sum = ", sumOfMinAbsDifferences(arr, n))
	
	
#This code is contributed by Sam007
