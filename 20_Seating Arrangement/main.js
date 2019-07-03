process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";

process.stdin.on("data", function (input) {
    stdin_input += input;                           
});

process.stdin.on("end", function () {
   main(stdin_input);
});

function main(input) {
	var out = "";
    var array = input.split('\n');
    let divide = 0;
    let opposite = 0;
    let reminder = 0;
    for (let i = 0; i < array[0]; i++) {
    	let N = array[i + 1];
    	divide = Math.floor(N / 12);
		reminder = N % 12;
		opposite = 0;
		if (reminder == 0)
			reminder = 24;
		if (reminder < 7) {
			divide++;
			opposite = 12 - (reminder - 1);
			out += (12 * divide - (reminder - 1));
			if (opposite == 7 || opposite == 12)
				out += " WS" + '\n';
			else if (opposite == 8 || opposite == 11)
				out += " MS" + '\n';

			else 
				out += " AS" + '\n';
		}
		else {
			opposite = 1 + 12 - reminder;
			out += (12 * divide + 1 + 12 - reminder);
			if (opposite == 1 || opposite == 6 || reminder == 24)
				out += " WS" + '\n';
			else if (opposite == 2 || opposite == 5)
				out += " MS" + '\n';

			else 
				out += " AS" + '\n';	
		}
    }

    console.log(out);   
}

