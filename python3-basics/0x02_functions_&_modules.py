import random               # importing modules
from math import pi,sqrt    # from module import variable1, var2 or * for all objects
from math import sqrt as square_root

# useful standard libraries:
    # string,re,datetime,math,random,os,multiprocessing,subprocessing,socket,email,json,docset,unittest,pdb,argparse,sys,pwn
    

def functions(place,amnt):  # taking 2 parameters.
    """
    this docstring comment usually used for describing the function,
    these are showed in runtime
    """
    # structure > function_name(arg1,arg2)
    print(place + " passed here to the function")
    amnt += 100         # value  : 112
    print(amnt)         # output : 112
    return amnt         # return value from function # cannot use the outside of the function
    # any other codes after the return statement won'n execute

# functions as objects
def add(x,y):
    return x+y
def do_twice(func, x,y):
    return func(func(x,y), func(x,y))

x=5
y=7
operation = add                 # assign, function 'add' to operation 'variable'
print(operation(x,y))           # output : 12
print(do_twice(add(x,y)))       # output : 24

print(functions("hell",12))     # take returned value from the function

def modules():
    for i in range(5):
        val = random.randint(1,6) # generate random values in the rane of 1-6
        print(val+pi)


# calling functions
functions("heaven",12)          # passing two argument
modules()