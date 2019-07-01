import java.io.*;

class Main{
	static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int divide, reminder, opposite;
		for (int i = 0 ; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			divide = N / 12;
			reminder = N % 12;
			if (reminder == 0)
				reminder = 24;
			if (reminder < 7) {
				divide++;
				opposite = 12 - (reminder - 1);
				out.print(12 * divide - (reminder - 1));
				if (opposite == 7 || opposite == 12)
					out.println(" WS");
				else if (opposite == 8 || opposite == 11)
					out.println(" MS");

				else 
					out.println(" AS");
			}
			else {
				opposite = 1 + 12 - reminder;
				out.print(12 * divide + 1 + 12 - reminder);
				if (opposite == 1 || opposite == 6 || reminder == 24)
					out.println(" WS");
				else if (opposite == 2 || opposite == 5)
					out.println(" MS");

				else 
					out.println(" AS");	
			}
		}

	}
	public static void main(String[] args) throws IOException {
		solve();
		out.close();
	}
}