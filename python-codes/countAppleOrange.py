
def countApplesAndOranges(s, t, a, b, apples, oranges):
    # Write your code here
    fallOrange = 0 
    fallApple = 0 
    for i in range(0,len(apples)):
        apples[i]+=a;
    for i in range(0,len(oranges)):
        oranges[i]+=b;
    # apples.sort()
    # oranges.sort()
    for i in range(0,len(apples)):
        if apples[i]>=s and apples[i]<=t:
            fallApple+=1
    for i in range(0,len(oranges)):
        if oranges[i]>=s and oranges[i]<=t:
            fallOrange+=1
    print(fallApple,fallOrange)


countApplesAndOranges(7,10,4,12,[2,3,-4],[3,-2,-4])