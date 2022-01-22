#importing random
from random import *

#taking input from user 

user_pass = input("Enter your password")

#store alphabet letter too use them to creack password 

password =  ['a', 'b', 'c','d', 'e','f', 'g', 'h', 'i', 'j','k','l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','W', 'x', 'y' , 'z' ]

#initializaing an empty string
guess = ""

#using while loop too generate many password untilll one of 
# them does not matches user_pass

while (guess!=user_pass):
    guess = ""
    #generate random matches using loop
    for letter in range(len(user_pass)):
        guess_letter = password[randint(0,25)]
        guess = str(guess_letter) + str(guess)
    #printing guess password
        print(guess)

#printing the matched password
print("your password is ", guess)
