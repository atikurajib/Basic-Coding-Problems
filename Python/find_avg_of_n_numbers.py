num = int(input("\nHow many numbers? "))
total_sum=0

for n in range(num):
    numbers = float(input("Enter the numbers: "))
    total_sum += numbers

avg = total_sum / num

print("\nAverage in these numbers: ",avg)
print("\n")
