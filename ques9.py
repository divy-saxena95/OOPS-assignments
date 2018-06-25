min = 0
mid = 50
max = 100
guess = "Is your secret number: "
print"Please think of a number between 0 and 100!"
print guess + str(mid) + "?"
inp = raw_input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ")
while inp != 'c':
    if  inp == 'h':
        max = mid
        mid = int((mid + min)/2)
    elif inp == 'l':
        min = mid
        mid = int((mid + max)/2)
    else:
        print"Sorry, I did not understand your input."
    print guess + str(mid) + "?"
    inp = raw_input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ")
if inp == 'c':
 print "Game over. Your secret number was:" + str(mid)