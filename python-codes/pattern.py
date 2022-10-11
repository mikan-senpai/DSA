def pattern(n):
    for i in range(1, n+1):
        print( ('#'*i).rjust(n) )


pattern(6)