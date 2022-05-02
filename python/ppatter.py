# 3
# 333222111
# 332211
# 321






#input ---> 4
#           4444333322221111
#           444333222111
#           44332211
#           4321


n = int(input())
for i in range(n, 0, -1):
    for j in range(n, 0, -1):
        k = str(j)
        print(k*i, end='')
    print()
