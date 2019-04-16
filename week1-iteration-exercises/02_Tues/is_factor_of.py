def getInput():
    number = input("Please enter a positive integer: ")
    return number

def get_factors():
    number = int(getInput())
    cur_num = 1
    while cur_num < number:
        if number % cur_num == 0:
            print(f"{cur_num}: factor of {number}")
        else:
            print(f"{cur_num}: not a factor of {number}")
        cur_num += 1

def get_factors2(init, acc):
    if acc == init:
        return
    else:
        if init % acc == 0:
            print(f"{acc}: factor of {init}")
        else:
            print(f"{acc}: not a factor of {init}")
        get_factors2(init, acc + 1)

# get_factors()
get_factors2(int(getInput()), 1)
