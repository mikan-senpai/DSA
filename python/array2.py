
car = ["ford","BMW","audi"]

x= car[0]

print(x)		
print(car[1])		#acsseesing the element at athe index 1
print(len(car))		#length  of the array 

print(car)   		#will print the whole array


# looping through arrays

for i in car:
	print(i)


#	ADDING ELEMENTS IN THE ARRAY 

car.append("Honda")

print(car)


#	REMOVING ELEMENTS FROM THE ARRAY 

car.pop(1)

print(car) 


# Array Methods
# Python has a set of built-in methods that you can use on lists/arrays.

# Method	Description
# append()	Adds an element at the end of the list
# clear()	Removes all the elements from the list
# copy()	Returns a copy of the list
# count()	Returns the number of elements with the specified value
# extend()	Add the elements of a list (or any iterable), to the end of the current list
# index()	Returns the index of the first element with the specified value
# insert()	Adds an element at the specified position
# pop()	Removes the element at the specified position
# remove()	Removes the first item with the specified value
# reverse()	Reverses the order of the list
# sort()	Sorts the list


