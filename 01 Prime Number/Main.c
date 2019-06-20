#include <stdio.h>
int main(){
	int N, i, j;
	scanf("%d" ,&N);
	for (i = 2; i <= N; ++i)
	{
		int indicator = 1;
		for (j = 2; j < i; j++) {
			if (i % j == 0 && i != 2){
				indicator = 0;
				break;
			}
		}
		if (indicator == 1)
			printf("%d ", i);
	}
	return 0;
}