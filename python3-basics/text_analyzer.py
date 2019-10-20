def count_char(text, char):
    count = 0
    for c in text:
        if c == char:
            count += 1
    return count

file_name = input("Enter a filename : ")
with open(file_name) as f:
    text = f.read().lower()
# print(count_char(text,"r"))

for char in "abcdefghijklmnopqrstuvwxyz":
    perc = 100*count_char(text,char)/len(text)
    print("{0} - {1}%".format(char,round(perc,2)))
