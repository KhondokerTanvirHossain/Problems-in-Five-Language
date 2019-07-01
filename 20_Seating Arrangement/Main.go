package main

import "fmt"

func main() {
	
	var T int
	var N int
	reminder := 0
	divide := 0
	opposite := 0
	fmt.Scanf("%d", &T)
	for  i := 0; i < T; i++ {
		fmt.Scanf("%d", &N)
		divide = N / 12
		reminder = N % 12
		if reminder == 0 {
			reminder = 24
		}
		if reminder < 7 {
			divide++
			opposite = 12 - (reminder - 1)
			fmt.Printf("%d ", 12 * divide - (reminder - 1))
			if opposite == 7 || opposite == 12 {
				fmt.Println("WS")
			}else if opposite == 8 || opposite == 11 {
				fmt.Println("MS")
			}else {
				fmt.Println("AS")
			}
			
		}else {
			opposite = 1 + 12 - reminder
			fmt.Printf("%d ", 12 * divide + 1 + 12 - reminder)
			if opposite == 1 || opposite == 6 || reminder == 24 {
				fmt.Println("WS")
			}else if opposite == 2 || opposite == 5 {
				fmt.Println("MS")
			}else {
				fmt.Println("AS")
			}
		}
	}
}