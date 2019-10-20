def dictionary():
    # dictionaries and lists are mutable objects
    # only immutable objects are allowed to use as keys otherwise TypeError occurs
    # None - absence of value / same as NULL
    # none object is returned by any function that doesn't explicitly return anything else
    ages = {"Dave":24, "Mary":42, "John":58}
    emty = {}
    print(ages["Dave"])
    print(ages["Mary"])
    print(ages["Bill"])     # KeyError

    # Dictionary functions

    squares = {
        1:1,
        2:4,
        3:"error",
        4:16,
    }
    squares[5] = "Five"     # new dictionary key:value can be added to a dictionary
    print(1 in squares)     # output : True
    print(squares.get(12))  # output : None
    print(squares.get(1234,"not in dictionary"))        # if key is not found, returns another specified value rather than default 'None'

def tuples():               # tuples are immutable  # like other types these are can be nested within each other
    # tuples are faster than lists
    words = ("spam", "eggs", "saussage",)
    print(words[0])         # output : spam
    words[1] = "cheese"     # output : TypeError
    my_tup = "one", "two", "three"  # tuples can be created without paranthesis
    print(my_tup[0])
    tpl = ()                # empty tuple

def list_slices():
    squares = [0,1,4,9,16,25,36,49,64,81]       # slicing can be also done on tuples
    print(squares[2:6])     # output : [4,9,16,25]  # 2 to 5 : indexes in count     # like the arguments to range, the first index provided in a slice is included in the result, but the second isn't
    print(squares[:7])      # output : [0,1,4,9,16,25,36]
    print(squares[7:])      # output : [49,64,81]
    print(squares[::2])     # output : [0,4,16,36,64]   # third values defines the interval
    print(squares[2:8:3])   # output : [4, 25]          #
    print(squares[1:-1])    # output : [1,4,9,16,25,36,49,64]   # when negative values used as index numbers, they are counted form the end to begining
    print(squares[::-1])    # slice is done backwords   # common & idiomatic way to reverse a list

def list_comprehension():   # quickly creating list whose contents obey a simple rule
    # these are inspired by set-builder notation in mathematics
    cubes = [i**3 for i in range(5)]                    # value : [0,1,8,27,64]
    evens = [i**2 for i in range(10) if i**2 % 2 == 0]  # value : [0,4,16,36,64] # enforce a condition on values in the list using if statement
    even  = [2*i for i in range(10*100)]                # Error : MemoryError    # trying to create a list in a very extensive will result in a MemoryError
    # this issue is solved by 'generators'

def string_formatting():
    nums = [4,5,6]
    msg  = "Numbers: {0}{1}{2}".format(nums[0], nums[1], nums[2])   # value : Numbers: 4 5 6
    a    = "{x},{y}".format(x=5,y=12)       # value = 5,12          # string formating can also done with names arguments.

def functions():
    # string functions
    print(",".join(["spam","eggs","ham"]))  # output : "spam,eggs,ham"
    print("Hello Me".replace("Me", "World"))# output : "Hello World"
    print("Thuis is a sentance".startswith("This"))     # output : True
    print("Thuis is a sentance".endswith("sentence"))   # output : True
    print("lower case".upper())             # output : LOWER CASE
    print("UPPER CASE".lower())             # output : upper case
    print("spam,eggs,ham".split(","))       # output : ['spam','eggs','ham']

    # numeric functions
    print(min(1,2,3,4,5))       # min(), max(), abs(), sum()

    # list functions
    nums = [55,44,33,22,11]
    if all([i>5 for i in nums]):
        print("All larger than 5")
    if any([i%2 == 0 for i in nums]):
        print("At least one is even")
    for v in enumerate(nums):    # used to iterate throuth the values and indices of a list simultaneously
        print(v)
    """
    output : 
    (0,55)
    (1,44)
    (2,33)
    (3,22)
    (4,11)
    """
# calling functions
dictionary()
tuples()
list_slices()
list_comprehension()
string_formatting()
functions()