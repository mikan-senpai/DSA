def fun():
    print("hey")

fun()




def fun1(email , lname):
    print(lname + " " + email)

fun1("mikan@gmail.com","mikan")


# Arbitrary Arguments, *args
# If you do not know how many arguments that will be passed into your function, add a * before the parameter name in the function definition.

# This way the function will receive a tuple of arguments, and can access the items accordingly:


def myFun(*kids):
    print("the youngest child is ", kids[2])
    print(kids)

myFun("mikan","bebo","mia")



# Keyword Arguments
# You can also send arguments with the key = value syntax.

# This way the order of the arguments does not matter.



def my_function(child3, child2, child1):
  print("The youngest child is " + child3)

my_function(child1 = "Emil", child2 = "Tobias", child3 = "Linus")



# Arbitrary Keyword Arguments, **kwargs
# If you do not know how many keyword arguments that will be passed into your function, add two asterisk: ** before the parameter name in the function definition.

# This way the function will receive a dictionary of arguments, and can access the items accordingly:



def my_function(**kid):
  print("His last name is " + kid["lname"])

my_function(fname = "Tobias", lname = "Refsnes")



# Default Parameter Value
# The following example shows how to use a default parameter value.

# If we call the function without argument, it uses the default value:



def my_function(country = "Norway"):
  print("I am from " + country)

my_function("Sweden")
my_function("India")
my_function()
my_function("Brazil")




# Passing a List as an Argument
# You can send any data types of argument to a function (string, number, list, dictionary etc.), and it will be treated as the same data type inside the function.
# E.g. if you send a List as an argument, it will still be a List when it reaches the function:


def my_function(food):
  for x in food:
    print(x)

fruits = ["apple", "banana", "cherry"]

my_function(fruits)

def thismyname(name):
    for int i in name:
            print(i+" ")

