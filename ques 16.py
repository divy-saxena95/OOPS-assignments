def gcdIter(a, b):
    c = min(a,b)
    
    while c > 0:
        if(a%c) == 0 and (b%c) == 0:
            return c
        else:
            c = c-1