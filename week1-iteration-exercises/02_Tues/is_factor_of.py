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

get_factors()
