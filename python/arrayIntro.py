#python program to demonstrate
#creating of array

import array as arr

#creating a array with integer type
a = arr.array('i',[1,2,34,44,66,77,88])

print("the new created array is: " , end=" ")
for i in range(0,3):
    print (a[i],end=" ")
print()


#creating array of float values only

b= arr.array('d',[2.65,66.6,81.31,24.42])


#printing the original array 

print("the arrayy with float values are:")

for i in range(0,4):
    print(b[i],end=" ")



