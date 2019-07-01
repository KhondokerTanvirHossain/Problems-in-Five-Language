#include <stdio.h>

int main(){
	int T, N, i, divide, reminder, opposite;
	scanf("%d", &T);
	for (i = 0; i < T; i++) {
		scanf("%d", &N);
		divide = N / 12;
		reminder = N % 12;
		if (reminder == 0)
			reminder = 24;
		if (reminder < 7) {
			divide++;
			opposite = 12 - (reminder - 1);
			printf("%d ", 12 * divide - (reminder - 1));
			if (opposite == 7 || opposite == 12)
				puts("WS");
			else if (opposite == 8 || opposite == 11)
				puts("MS");

			else 
				puts("AS");
		}
		else {
			opposite = 1 + 12 - reminder;
			printf("%d ", 12 * divide + 1 + 12 - reminder);
			if (opposite == 1 || opposite == 6 || reminder == 24)
				puts("WS");
			else if (opposite == 2 || opposite == 5)
				puts("MS");

			else 
				puts("AS");	
		}	
	}	
}