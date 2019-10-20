# Learn Python on One Python Project
# Coded by _lucifer_
# Code may not run
#############################################
###           PYTHON CHEATSHEET           ###
#############################################

import random                   # importing modules (module.var or module.*(all/wildcard))
from math import pi,cos       	# importing specific variables from a module
from os import *                # modules || string, re, datetime,math,random,os,multiprocessing,subprocess,socket,email,json,doctest,unittest,pdb,argparse,sys,url,*
                                # Tasks   || string parsing, data serializing, testing, debugging and manipulating dates, emails, cmd line arguments and more
from math import sqrt as square_root    # importing a module variable under a different name
# to install third party modules via PyPi > use cmd in system terminal "pip install module_name"

# basic concepts
def unit_one():                 # defining function
    """
    this is docstring comment that shows in run time
    """
    print("Hellow Friend")      # Simple txt output # escape characters \n \t  #'' valid
    x = int(raw_input("Do You Speak Binary : "))  # taking user input as float /int/str/bool
    print(x)
    y = (6%4*2)**2+7//4         # (),**,*,/,%,//,+,-
    x+= y                       # in place operator
    del y                       # deleting a variable
    return 0

# control structures
def unit_two():
    boolean_val = True          # True & False
    boolean_val = 5<=10         # comparison ==, !=, >=, <=

    if True:       # expression # supports nested if statements
        # statement
    elif boolean_val:       # boolean logic or/and/not/xor -- "not" puts before the variable 
        print(boolean_val)
        #in the elif
    else:
        # should include else finally if there is an elif
                        # operator procedence
                        # () , **, ~+-,(~complementation,unary +-) *,/,%,// ,+ , -,>>,<<,&,^|,comparison,equality,assignment,is,in,not,or,and 
    i=0
    while True:         # iterate with while loop
        break           # terminate the loop
        continue        # skip the current value and keep on the loop
        i += 1          # increment the value by 1
    # for loop
    bar = ["this","is","bar","var"]
    for item in bar:    # iterate through the list items
        print(item)     # print list items
    for i in range(x):
        # loop through x times

    # Lists
    def lists_():
        list_ = ["one","two","three ","four"]   # define a list
        a = list_[0]                            # assign 1st element in the list to var a
        empty_list = []
        multi_lists = ["the","quick",["fox","jumps","over","the"],"brown",] # nested list like multi dimentional array
        multi_lists[2][0] = "wolf"              # reassigning value
        new_list = list_ + ["lazy","son of","a programmer"] # concat two lists -- string oprations are also valid
        bool_existence = "two" in list_         # presence check of value in a list
        bool_existence = "two" not in list_
        bool_existence = not "two" in list_
        list_.append("five")            # append to the end of the list
        len(multi_lists)                # length of the list
        list_.insert(0,"what")          # insert(index,value)
        multi_lists.index('brown')      # gives the index of first occurence of the value in the list
                                        # throws ValueError if value not exists in the list
        max(list_)              # gives max value on list, lexicographically valid
        min(list_)              # gives minimum value
        list_.count("the")      # how many times the object occures in the list
        list_.remove("the")     # remove a value in the list
        list_.reverse()         # reverse objects in a list

        foo = list(range(10))           # creates list 0-9 with 10 values
        foo = list(range(5,10))         # [5,6,7,8,9]
        foo = list(range(1,10,2))       # [1,3,5,7,9] third argument determines interval if the sequence

# Functions and Modules
def unit_three(var,val):
    # inside here var = "three" and val = 3
    # varialbles and arguments only valid in the function itself
    value = random.randint(1,10)    # random values range in 1-10
	return val   					# returns variable val
	# --> Octothorpe/ Hash	

s = unit_three("tree",33)       # take the returned value from the function
func = unit_three               # function can be referrece by another assigned name
c = func("3",3)                 # take the returned value from the function


####### Exceptions ##########
# ImportError
# IndexError - list indexed with out of range number
# NameError - unknown variable used
# SyntaxError - code cant be parsed properly
# TypeError - function is called on a value of an inappropriate type
# ValueError - correct type but inappropriate value
# ImportError
# ZeroDivisionError
# OSError
# AssertionError

def unit_four(fun,vx,vy):
    raise ErrorType("Details about the error")      # raising specified type of error
    try:
        # this code
    except ErrorType:
        raise           # re raise the occured exception
        # handle the exception
    except (ErrorType2,ErrorType3):
        # handle the second error type
    except:
        # handle all possible exceptions
    finally:
        # this code run no matter what
    assert True
    assert (False and False),"Error Details"        # throws AssertionError: Error Details

def files_():
    # opening file
    my_file = open("test.txt","rb")                 # file open modes, read(default), write, binary read/write
    content = file.read(16) # 16 no. of bytes to read # reading file content and assign contents to variable content
    content = file.read(4)  # read next bytes
    content = file.read()   # read the rest of the file
    content = file.readlines() # gives lines as lists items
    my_file.close()                                 # close the opend file
    for line in my_file:    # iterate through the file contents line by line blank line separated
        print(line)

    file = open("test.txt", "w")
    file.write("this things written to a file")     # Writing contents to a file
    ammount_written = file.write(msg)               # number of bytes written to a file if successful
    try:
        f = open("test.txt","r")
        print(f.read())
    finally:
        f.close()
    # or
    with open("test.txt","r") as f:
        print(f.read())
    
    
# function caller menu
unit_one()      # Basics
unit_two()      # Control Structure
    lists_()    # List & List Functions
unit_three("three",3)    # Funcions & Modules
unit_four(func,v1,v2)    # function can carry another function as an argument
files_()
