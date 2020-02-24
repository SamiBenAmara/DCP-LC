#Implement division of two positive integers without using the division, multiplication, or modulus operators. 
#Return the quotient as an integer, ignoring the remainder.

# Perform division by subtracting the divisor from the dividend until the dividend's value falls below zero
def div(x, y):
	if (x - y < 0): return 0
	return 1 + div(x - y, y)

a = int(input("Enter One Number: "))
b = int(input("Enter Another Number: "))
    
print(div(a, b))