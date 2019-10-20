# exception types
    # ImportError - import fails
    # IndexError - index out of range
    # NameError - unknown variable is used
    # SyntaxError - code cant parsed properly
    # TypeError - function is called on a value of inappropriate type
    # ValueError - function is called on a value of correct type but inappropriate value
    # ZeroDivisionError , OSError

# exception handling
def excep():
    try:
        wdr = "simple"
        cal = 34/0
        art = wdr/12
    except ZeroDivisionError:
        print("Error Occured \n Dividede by Zero")
    except (ValueError, TypeError):         # Note paranthesis when dealing wih multiples error types
        print("Error Occured")
        raise       # raise whatever exception ooccured
    except:
        print("This catches all unexpected errors ")
    finally:
        print("This code runs no matters what")

    # raising an error
    raise TypeError()
    raise ValueError("Invalid value.!")

def assertion():
    # sanity-check to turn off when finish testing the programe
    # if result comes up fault an exception is raised
    # often places this start of the function to check valid input, and after a function call to check for calid output
    # AssertionError can be caught and handle like regular errors, if not handled this type of exception will terminate the programme
    print(1)
    assert 2+2==4
    print(2)
    assert 1+1==3
    print(3)
    assert (2>=5), "two is amaller than 5 !"    # second argument passes to the assertion error
    # output : 1 \n 2 \n Assertion Error

# calling functions
excep()
assertion()