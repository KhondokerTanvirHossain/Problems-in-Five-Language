import java.io.*;

class Main{
	static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 2 ; i <= N; i++) {
			boolean indicator = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 2) {
					indicator = false;
					break;
				}
			}
			if (indicator == true)
				out.print(i + " ");
		}

	}
	public static void main(String[] args) throws IOException {
		solve();
		out.close();
	}
}