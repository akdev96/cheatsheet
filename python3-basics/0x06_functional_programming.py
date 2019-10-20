"""
Key part of functional programming is higher-order functions.
Higher order functions take other functions as objects or return them.
"""
# eg :
def apply_twice(func, arg):             # this function takes another function as its argument, and
    return func(func(arg))              # call it twice inside its body

def add_five(x):
    return x+5

print(apply_twice(add_five,10))        # output : 20


# functional programming seeks to use pure functions. pure functions have no side effects
# and return a value that depends only on their arguments.
def pure_function(x,y):
    temp = x + 2*y
    return temp/(2*x+y)

some_list = []
def impure(arg):
    some_list.append(arg)


# pure functions:   esier to reason about and test / more efficient / easier to run in parallel / once the function has been evauated
# for an input, the result can be stored and reffered to the next time the function of that input is needed,
# reducing the number of times the function is called.
# this is called memoization

# the main diasvantage of using only pure functions is that they majorly complicate the otherwise simple tasks of I/O,
# since this appears to inherently require side effects. they can also be more difficult to write in some situations.

# Lambdas
# lambda functions aren't as powerful as named functions they can only do things that require a single expression.
# usually equivalent to a single line of code.
# lambdas can be assigned to variables and use like normal functions

# named function
def polynomia(x):
    return x**2 + 5*x + 4
print(polynomia(-4))                    # output : 0

# lambda    / anonymous function
print((lambda x : x**2 + 5*x + 4)(-4))  # output : 0
# on the fly called it with an argument


# map & filter / very useful higher-order functions that operate on lists or simillar objects caled iterable
# these things should convert into lists before print
# map
def add_five(x):
    return x + 5
nums = [11,22,33,44,55]
result = list(map(add_five,nums))
print(result)       # output : [16,27,38,49,60]
# this can be easily achievable with lambdas

result = list(map(lambda x : x+5, nums))        # value : [16,27,38,49,60]


# function filter, filters an iterable by removing items that don't match a predicate (a function that returns a boolean)
res = list(filter(lambda x : x%2==0, nums))    # value : [22,44]

# generators / are a type of iterable , like lists or tuples.
# unlike lists, they don't allow indexiong with arbitrary indices, but they can still be iterated through with for loops.
# generators can bee creaed using functions and the yield statement
# the yield statement is used to define a generator, replacing the return of a function to provide a result to its caller without destroying local variable
def countdown():
    i = 5
    while i>0:
        yield i
        i -= 1
for i in countdown():
    print(i)                # output : 5,4,3,2,1  /  as a top to bottom list

# due to the fact that they yield one item at a time, generators don't have the memory restrictions of lists
# in a facet they can be infinite.
# in short, generators allow you to declare a function that behaves like an iterator, i.e. it can be used in a for loop
def infinite_seven():
    while True:
        yield 7

for i in infinite_seven():
    print(i)

# finite generators can be converted into lists by passing them as arguments to the list function
# using generators results in improved performance, which is the result of lazy (on demand) generation of values,
# which translate to lower memory usage. Furthermore, we do not need to wait until all the elements have been generated before we start to use them.
def numbers(x):
    for i in range(x):
        if i%2==0:
            yield i
print(list(numbers(11)))        # output : [0,2,4,6,8,10]


# decorators / a single function can have multiple decorators
# decorators provide a way to modify functions using other functions. this is ideal when you need to extend the functionality of functions that you don't want to modify
def decor(func):
    def wrap():
        print("=============")
        func()
        print("=============")
    return wrap
def print_text():
    print("Hello World.!")
decorated = decor(print_text())         # output : decorated version of print_text()
# or
@decor
def print_text():
    print("Hello World.!")
decorated()


# Recursion
# self-reference / function calling themselves / used to solve problems that can be broken up into easier sub- problems of same type
def factorial(x):
    if x==1:                        # if doesn't implements the base case. The intrepreter runs out the memory and crashes / RuntimeError: maximum recussion depth exceeded
        return 1                    # the base case act as the exit condition
    else:
        return x*factorial(x-1)     # the function calling itself
factorial(5)
# recursion also can be indirect.


# sets   / empty sets - set(), {}  # membership testing & eliminate duplicate entries
# unordered, can't be indexed, different from lists in several ways, shares some list operations,
# cannot contain duplicates, faster to check, to add item to set use 'add', method 'remove', 'pop' removes arbitrary element
num_set = {1,2,3,4,5}
word_set = set(["spam","eggs","saussage"])
print(3 in num_set)                 # output : True
print("spam" not in word_set)       # output : False
num_set.add(-7)
num_set.remove(3)

first = {1,2,3,4,5,6}
secnd = {4,5,6,7,8,9}
print(first | secnd)    # output : {1,2,3,4,5,6,7,8,9}  # union operator > combines sets
print(first & secnd)    # output : {4,5,6}              # intersection > items only in both
print(first - secnd)    # output : {1,2,3}              # difference > get items in the first but not in 2nd
print(secnd - first)    # output : {7,8,9}
print(first ^ secnd)    # output : {1,2,3,7,8,9}        # symmetric difference > get items in either sets, but not in both

# Data Structures
# lists, dictionaries, tuples, sets
# When to use dictionaries
    # logical association between key:value pairs
    # fast lookup for data, based on custom key
    # constatatntly modifying data, mutable(can change)
# Other types
    # lists - does not need random access, simple literable caoolection that modified frequently
    # sets - uniqueness for elements
    # tuples - data cannot change(immutable)
# tuple might represent a key for dictionary


# itertools
