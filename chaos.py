# File: chaos.py
# Asimple program illustratin chaotic behavior

def main():
    print("This program illustrates a chaotic function")
    n = input("How many numbers should I print: ")
    x = input("Enter a number between 0 and 1: ")
    y = input("Enter a number between 0 and 1: ")
    for i in range(n):
        x = 3.9 * x * (1-x)
        y = 3.9 * y * (1-y)
        print(x)
        print(y)

main()
