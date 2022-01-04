#	CREATING A CLASS

class Myclass:
	x=5


# 	CREATING A OBJECT

p1 = Myclass()
print(p1.x)


'''

The __init__() Function
The examples above are classes and objects in their simplest form, and are not really useful in real life applications.

To understand the meaning of classes we have to understand the built-in __init__() function.

All classes have a function called __init__(), which is always executed when the class is being initiated.

Use the __init__() function to assign values to object properties, or other operations that are necessary to do when the object is being created:

'''
NOTE