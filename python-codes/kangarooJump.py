# def kangaroo(x1, v1, x2, v2):
#     # Write your code here
#     if meet(x1, v1, x2, v2)==1:
#         print("YES")
#     else:
#         print("NO")
    
# def meet(x1, v1, x2, v2):
#     if x1==x2:
#         print 1
#     print meet(x1+v1,v1,x2+v2,v2)

# kangaroo(2,1,1,2)
# kangaroo(0,3,4,2)

# # 0 3 4 2


def kangaroo(x1, v1, x2, v2):
    # Write your code here
    if (v1 > v2) and (x2 - x1) % (v2 - v1) == 0:
        print("YES")
    else:
        print("NO")


kangaroo(2,1,1,2)
kangaroo(0,3,4,2)
