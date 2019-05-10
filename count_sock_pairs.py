def count_sock_pairs(socks):
    sock_singles = set()
    total_pairs = 0
    for sock in socks:
        if sock in sock_singles:
            total_pairs += 1
            sock_singles.remove(sock)
        else:
            sock_singles.add(sock)
    return total_pairs


socks = [1, 1, 4, 5, 2, 3, 4, 6, 1]
socks2 = []
socks3 = [1, 3, 2, 4, 5, 3, 7, 8, 15, 0]
test1_result = count_sock_pairs(socks)
test2_result = count_sock_pairs(socks2)
test3_result = count_sock_pairs(socks3)
print(f"Test 1 Result: {test1_result == 2}")
print(f"Test 2 Result: {test2_result == 0}")
print(f"Test 3 Result: {test3_result == 1}")