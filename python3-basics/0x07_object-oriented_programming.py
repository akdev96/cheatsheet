""""
Paradigms of programming
    (1) imperative - (using statements, loops, & functions as subroutines)
    (2) functional - (using pure functions , higher-order functions & recursion)
    (3) Object-Oriented programming - (objects are created using classes) focal point of OOP
                    Class - describes what object will be,
                            separate from the object itself
                            object's blueprint, description or definition
                            can use ti create multiple objects
"""

#Ex :
class Cat:
    # class attributes are shared by all instances of the class
    tipe = "living"                     # class attribute, can access from instance of a class or the class itself
    # __init__ method is calss constructor
    def __init__(self,color,legs):      # __init__ method called when an instance(object) of class is created using the class name as a function
        self.color = color              # self.attribute
        self.legs = legs

    def bark(self):                     # every method must have self as first parameter
        print("woof!")

felix = Cat("ginger",4)
rover = Cat("dog-colored",4)
stumpy = Cat("brown",3)

print(felix.color)                      # \/
print(Cat.tipe)                         # class attribute, can access from instance of a class or the class itself
felix.bark()

# trying to access an attribute of an instance that isn't define causes AttributeError
# this also applies when you call an underfined method

# Inheritance
class Animal:
    def __init__(self,name,color):
        self.name = name
        self.color = color

class Cat(Animal):
    def purr(self):
        print("Purr...")
