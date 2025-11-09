import java.util.*;

class BFS {
    private int[] visited;
    private int[] parent;
    private int start;
    private Graph g;

    BFS(Graph g, int start) {
        this.g = g;
        this.start = start;
        visited = new int[g.v()];
        parent = new int[g.v()];
        Arrays.fill(parent, -1);

        calBfs(visited, parent, start);
    }

    private void calBfs(int[] visited, int[] parent, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i : g.adj.get(node)) {
                if (visited[i] == 0) {
                    parent[i] = node;
                    visited[i] = 1;
                    q.add(i);
                }
            }
        }
    }

    boolean connected(int v) {
        return visited[v] == 1;
    }

    void printPath(int v) {
        if (!connected(v)) {
            System.out.println("no possible path");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        int u = v;

        while (u != -1) {
            stack.push(u);
            u = parent[u];
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) System.out.print(" -> ");
        }
        System.out.println();
    }
}
