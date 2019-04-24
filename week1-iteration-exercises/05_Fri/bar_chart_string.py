def get_bar_chart(string):
    return print("\n".join(map(lambda ch: ch*(ord(ch.lower()) - 96) if ch != " " else "\r", string)))
    # (ord(char.lower() - 96) // 26 == 0

get_bar_chart("Base Camp Coding Academy")
