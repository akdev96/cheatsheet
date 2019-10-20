def compare():
    bool_val = 2==3         # value : False
    "hello" == "hello"      # value : True
    # == equals to  , != Not equals to,
    # > Greater than, <  Less than,
    # >= Greater than or equals, <= less than or equals
    # also works for lexicographically

def loops():
    # if
    if 1==1:
        print('i\'m in the if block')
        # nested if
        if 2==2:
            print('in the in the if AKA nested if')
        print('out scope of the child if')
    #print("out scope of the first if")
    # elif
    elif 3==3:
        print("Here comes elis")
    elif 4==4:
        print("Not elis it\'s elif")
    elif 5==4:
        print("This won\'t execute because expression value is false")
    # else / every time elif should ends with else
    else:
        print("Finally in the else block")

    # while loop iteration
    i = 0
    while i<5:
        print("in while block")
        print(i)
        i += 1
        if i == 1:
            print("Skipping ...")
            continue    # skip the current value and continue the loop / using outside the loop cause an error
        if i == 3:
            print("Breaking ...")
            break       # terminate the loop immediately / using outside the loop cause an error
    print("While ended")

    # for loop  / like foreach
    words = ["hello","world","spam","eggs"]
    for wrd in words:
        print(wrd+ " !")    # list down all items
    for i in range(5):
        print(i)            # repeate the block certain number of times

def logics():
    # and
    1==1 and 2==2       # value : True
    1==1 and 1==2       # value : False

    # or
    1<2 or 4>2          # value : True
    2<=2 or 5!=5        # value : False

    # not
    not 1==1            # value : False



# operator procedence
    # ()    paranthesis ,
    # **    exponentiation ,
    # ~ + -     complemet/unary plus and minus,
    # * / % //  multiple/divide/modulo/floor dividion ,
    # + -   addistion and substraction ,
    # >> << right and left bitwise shift ,
    # &     bitwise and ,
    # ^ |   bitwise xor and regular or,
    # <= < > >=     comparison operators,
    # <> == !=  equality operators ,
    # assignment and inplace operators ,
    # is is not     identity operators ,
    # in not in     membership operators ,
    # not or and    logical operators.

def lists():
    # lists - uses to store an indexed values
    emt_lst = []
    words = ["hello", "world", "!"]

    # list operations
    print(words[0])         # output : hello
    things = ["string",0,[1,2,'num'],4.56]
    print(things[2][2])     # nested lists # output : num
    things[1] = 7           # changing value in the list
    print(words + [1,2,3])  # output : ['hello','world','!',1,2,3]
    print("string" in things)   # output : True
    print(not 2 in things)      # output : True  # print(2 not in things)
    str = "Hello World!"
    print(str*2)
    print(str[6])               # output : W

    # list functions
    nums = [1,2,3,4,5,6,"seven","eight",12.67]
    nums.append(7)      # append a value at the end # append method of the list class
    print(len(nums))    # print the length of the nums list # norml function
    index = 8
    nums.insert(index, "barr")  # insert new item at any position
    print(nums.index('eight'))  # output : position / index of the "eight"
    max(nums)       # output : max num
    min(nums)       # output : min num
    nums.count(2)   # output : count obj
    nums.remove(5)  # output : remove obj
    nums.reverse()  # output : revers order

    # range
    bers = list(range(10))      # creating 0-9 list and convert it into a list  # output : [0,1,2,3,4,5,6,7,8,9]
    # list(range(3,8))          # output : [3,4,5,6,7]
    # list(range(5,20,2))       # output : [5,7,9,11,13,15,17,19]



# calling functions
compare()
loops()
logics()
lists()