#  You are given a number, you have to display the sum of all the even numbers.

def displayEven(n):
    even = 0
    for i in range(0,n+1):
        if i % 2 == 0 :
            even += i
    print(even)

displayEven(100)

#  Multiply two numbers without using the multiplication operator.


def helper(n,x):
    if x == 1:
        return n 
    return n + helper(n,x-1)

def multiplx(n,x):
    print(helper(n,x))

multiplx(4,20)




