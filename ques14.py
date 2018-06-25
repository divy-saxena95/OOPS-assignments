def iterPower(base, exp):
    p = 1
    while exp > 0:
        p= (p * base)
        exp =exp- 1
    return p   
    