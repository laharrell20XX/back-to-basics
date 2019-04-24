import functools as ft

def is_truthy_list (binary_arr):
    initial_dict = {"numOnes": 0, "numZeroes": 0}
    binary_dict = ft.reduce(build_dict, binary_arr, initial_dict)

    if binary_dict["numOnes"] > binary_dict["numZeroes"]:
        return True
    return False

def build_dict (initial, elm):
    if elm == 1:
        initial["numOnes"] += 1
    else:
        initial["numZeroes"] += 1
    return initial

def is_truthy_list2 (binary_arr):
    ones_count = ft.reduce(lambda count, elm: count + 1 if elm == 1 else count, binary_arr, 0)
    if ones_count > (len(binary_arr) / 2):
        return True
    return False

# print(is_truthy_list([0,1,1,0,0]) == False)
# print(is_truthy_list([]) == False)
# print(is_truthy_list([0,0,0,1]) == False)
# print(is_truthy_list([1,1,1,1]) == True)

print(is_truthy_list2([0,1,1,0,0]) == False)
print(is_truthy_list2([]) == False)
print(is_truthy_list2([0,0,0,1]) == False)
print(is_truthy_list2([1,1,1,1]) == True)
