import java.io.*;
import java.util.*;

class Main{
	static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int MAX = 10;
	static int ans = 0;
	static ArrayDeque<Integer>[] adj = new ArrayDeque[MAX]; 
	static int[] dp = new int[MAX];
	static int[] size = new int[MAX];
	static boolean[] visited = new boolean[MAX];
	static int calcSize(int u, int p) {
		size[u] = 1;
		for (int v : adj[u]) {
			if (v != p)
				size[u] += calcSize(v, u);
		}
		return size[u];
	}
	static int calcDp(int u, int p) {
		dp[u] = size[u];
		for (int v : adj[u]) {
			if (v != p) 
				dp[u] += calcDp(v, u);
		}
		return dp[u];
	}
	static void dfs(int u, int p) {
		ans = (ans > dp[u]) ? ans : dp[u];
		visited[u] = true;
		for (int v : adj[u]) {
			if (v == p && visited[v] == true) continue;
			dp[u] -= dp[v];
			dp[u] -= size[v];
			size[u] -=size[v];
			size[v] += size[u];
			dp[v] += size[u];
			dp[v] += dp[u];
			dfs(v, u);
			dp[v] -= dp[u];
			dp[v] -= size[u];
			size[v] -=size[u];
			size[u] += size[v];
			dp[u] += size[v];
			dp[u] += dp[v];
		}
		visited[u] = false;
	}
	static void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayDeque<Integer>();
			visited[i] = false;
		}
		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());	
			int v = Integer.parseInt(st.nextToken());
			u--;
			v--;
			adj[u].offer(v);	
			adj[v].offer(u);	
		}
		calcSize(0, -1);
		calcDp(0, -1);
		dfs(0, -1);

		out.println(ans);

	}
		
	public static void main(String[] args) throws IOException {
		solve();
		out.close();
	}
}
