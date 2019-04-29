import functools as ft
def is_valid_ransom_note(magazine, note):
    letter_total_in_mag = ft.reduce(convert_to_dict, magazine, {})
    for char in note:
        if char == " ":
            continue
        if char in letter_total_in_mag:
            if letter_total_in_mag[char] == 0:
                return False
            else:
                letter_total_in_mag[char] -= 1
        else:
            return False
    return True

def convert_to_dict(string_dict, char):
    char = char.strip()
    if char in string_dict:
        string_dict[char] += 1
    elif char:
        string_dict[char] = 1
    return string_dict

test1_mag = "Hello World"
test1_note = "He old"
test2_mag = ""
test2_note = ""
test2_note2 = "Hello my dear sir"

test3_mag = "Enjoy Soda today!"
test3_note = "So dat day"
test3_note2 = "No Say my Joy"
test3_note3 = ""

print(f"Test 1 Actual:{is_valid_ransom_note(test1_mag, test1_note)}, Test 1 Expected: True") 
print(f"Test 2 Actual:{is_valid_ransom_note(test2_mag, test2_note)}, Test 2 Expected: True")
print(f"Test 3 Actual:{is_valid_ransom_note(test2_mag, test2_note2)}, Test 3 Expected: False")
print(f"Test 4 Actual:{is_valid_ransom_note(test3_mag, test3_note)}, Test 4 Expected: True")
print(f"Test 5 Actual:{is_valid_ransom_note(test3_mag, test3_note2)}, Test 5 Expected: False")
print(f"Test 6 Actual:{is_valid_ransom_note(test3_mag, test3_note3)}, Test 6 Expected: True")
