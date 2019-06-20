package main

import "fmt"

func main() {
	var N int
	indicator := 1
	fmt.Scanf("%d", &N)
	for i := 2; i <= N; i++ {
		indicator = 1
		for j := 2; j < i; j++ {
			if i % j == 0 && i != 2 {
				indicator = 0
				break
			}
		}
		if indicator == 1 {
			fmt.Printf("%d ", i)
		}
	}
}