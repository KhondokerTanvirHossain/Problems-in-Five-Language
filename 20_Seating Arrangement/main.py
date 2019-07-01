from sys import stdin, stdout
T = int(stdin.readline())
for i in range(0, T) :
	N = int(stdin.readline())
	divide = (int)(N / 12)
	reminder = (int)(N % 12)
	if reminder == 0 :
		reminder = 24
	if reminder < 7 :
		divide = divide + 1
		opposite = 12 - (reminder - 1)
		stdout.write((str)(12 * divide - (reminder - 1)))
		if opposite == 7 or opposite == 12 :
			stdout.write(" WS" + '\n')
		elif opposite == 8 or opposite == 11 :
			stdout.write(" MS" + '\n')
		else :
			stdout.write(" AS" + '\n')
	else :
		opposite = 1 + 12 - reminder
		stdout.write((str)(12 * divide + 1 + 12 - reminder))
		if opposite == 1 or opposite == 6 or reminder == 24 :
			stdout.write(" WS" + '\n')
		elif opposite == 2 or opposite == 5 :
			stdout.write(" MS" + '\n')
		else :
			stdout.write(" AS" + '\n')
	
	