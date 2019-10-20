def open_file():
    # opening modes :
    # r - read
    # w - write
    # a - append
    # b - binary
    # wb - binary write and so on
    # # **** test for 3 modes ?

    file = open("files/filename.txt" , "r")       # opening a file
    # do stuff
    file.close()

def read_file():
    file = open("files/filename.txt", "r")
    content = file.read()           # value : whole content in file
    print(content)
    file.close()

def read_files(bytes_to_read):
    file = open("files/filename.txt", "r")
    print(file.read(bytes_to_read)) # output : first 16 bytes
    print(file.read(4))             # output : 4 bytes from where stops reading (16 bytes)
    print(file.read())              # output : rest of all bytes    (from 20 bytes to the end)
    # after all contents in the file have been read, any attempts to read further from file will return an empty string.

    # retrieving each line from file
    print(file.readlines())

    # iterate through the lines
    for line in file:
        print(line)                  # print function automatically adds a new line end of its output
    file.close()

def write_files():
    # figure 1
    file = open("files/newfile.txt", "w")   # opening file in w mode will clear the text in the file
    file.write("This has been written to a file")
    print("File is written")
    text = "the quick brown"
    amount_written = file.write(text)       # value : number of bytes written to a file
    file.close()

    # figure 2
    try:
        f = open("files/filename.txt")
        print(f.read())
    finally:
        f.close()

    # figure 3
    with open("files/filename.txt") as f:
        print(f.read())

# calling functions
open_file()
read_file()
read_files(16)
write_files()