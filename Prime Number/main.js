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
    for(let i = 2; i <= input; i++) {
    	let indiicator = 1;
    	for (let j = 2; j < i; j++) {
    		if (i % j == 0 && i != 2) {
    			indiicator = 0;
    			break;
    		}
    	} 
    	if (indiicator == 1)
    		out = out + i + " ";
    }
    console.log(out);   
}

