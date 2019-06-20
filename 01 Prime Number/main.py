from sys import stdin, stdout
N = int(stdin.readline())
for i in range (2, N + 1) :
	indicator = 1
	for j in range(2, i) :
		if i % j == 0 and i != 2 :
			indicator = 0
			break
	if indicator == 1 :
		stdout.write(str(i) + " ")
