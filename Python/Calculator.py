# import pylance
import math

print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square")
a=input("Enter your choice")

match a:
    case 1:
        a=input("Enter a number:-")
        b=input("Enter the another number:-")
        print(a+b)
    case 2:
        a=input("Enter a number:-")
        b=input("Enter the another number:-")
        print(a-b)
    case 3:
        a=input("Enter a number:-")
        b=input("Enter the another number:-")
        print(a*b)
    case 4:
        a=input("Enter a number:-")
        b=input("Enter the another number:-")
        print(a/b)
    case 5:
        a=("Enter a number:-")
        print(math.pow(a,2))
        