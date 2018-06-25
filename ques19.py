def isIn(char, aStr):
    sortaStr = sorted(aStr)
    low = 0
    high = len(sortaStr)
    mid = (low + high) / 2
    i = 0
    while i < 50:
        i += 1
        if len(aStr) <= 0:
            return False
            
        if char == sortaStr[mid]:
            return True
        if (low == mid or high == mid) and (char != sortaStr[mid]):
            return False
        else:
            if char > sortaStr[mid]:
                low = mid
                return isIn(char, sortaStr[low:high])

            else:
                high = mid
                return isIn(char, sortaStr[low:high])

