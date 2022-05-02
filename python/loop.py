

fruits=[2,3,4,6,10,56]

for x in fruits:
    print(x)

for x in "banana":
    print(x)


vehicle=["car","bus","train"]

for x in vehicle:
    if x == "bus":
      break
    print(x)
    

# The range() function returns a sequence of numbers, starting from 0 by default, and increments by 1 (by default), and ends at a specified number.

# using range in loops
for x in range(6):
  print(x)


# range(6,12)=> here in the function range() 
# -> 6 is the inclusive oen and the 12 is the exclusive one


for x in range(6,12):
  print(x)

#Now including the increment parameter in the range function
#The range() function defaults to increment the sequence by 1, however it is possible to specify the increment value by adding a third parameter: range(2, 30, 3):

for x in range(6,12,3):
    print(x)



# ELSE IN FOR LOOP 
for x in range(6):
    print(x)
else:
    print("finished printing")


#USING BREAK WIITH IF ELSE


for x in range(6):
    if x==3: break  
    print(x)
else:
    print("finished printing")




# WORKING WIITH NESTED LOOPS 

adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
    for y in fruits:
        print(x,y)


#the pass statement 
# for loops cannot be empty, but if you for some reason have a for loop with no content, put in the pass statement to avoid getting an error.


for x in [0, 1, 2]:
  pass