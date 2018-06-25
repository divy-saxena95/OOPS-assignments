def oddTuples(aTup):
    rst = ()
    for i in range(len(aTup)):
        if i%2 == 0:
            rst = rst + (aTup[i],)
    return rst