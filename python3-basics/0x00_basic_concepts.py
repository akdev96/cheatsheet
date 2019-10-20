def basic():
    # output
    print('Hello World ...! \nHere is New line')
    print('Tab\nspace')

    # simple arithmatic operations () ** * / + -
    var = (12+2)*2          # value : 28
    vars= 12/3              # value : 4.0
    exp = 2**3              # value : 8
    sqr = 16**(1/2)         # value : 4
    quotiant  = 20//6       # value : 3
    remainder = 1.25%0.5    # value : 0.25

    # string operations
    print("""First line\' s
    second line.""")
    print("First line concatenation"+","+"second line")
    print("this 3 times"*3) # output : 'this 3 timesthis 3 timesthis 3 times'
    print(4*'2')            # output : '2222'

    # user input
    input("This is user input so enter something : ")   # raw_input('string') in python 2.7

    # type conversion
    boo = bool("True")
    stn = "22"
    itn = int(stn)          # value : 22
    flt = float(stn)        # value : 22.0
    stg = str(flt)          # value : '22.0'
    ttl = float(input("Enter No.1 : "))+float(input("Enter No.2 : "))
    ttl = str(ttl)
    print('Total is : '+ttl)

    # variables
    var = 'value'           # value : 'value'
    var = 12                # value : 12
    print(var+"!!!")        # output: 12!!!
    del var                 # delete var variable:
    # variable names : spaces are not allowed/ doesnt begin with number/ no key word/ no limit/ case sensiive

    # in place opeators / for like >  var = var + foo
    x = 2                   # value : 2
    x += 3                  # value : 5
    x -= 1                  # value : 1
    x *= 5                  # value : 10
    x /= 2                  # value : 1
    x **= 3                 # value : 8
    y = 'spam'
    y += 'eggs'
    # also //, % & for strings

# calling functions
basic()