import java.util.*;

class DFS {
  private int[] visited;
  private int[] parent;
  private int start;
  private Graph g;

  DFS(Graph g, int start) {
    this.g = g;
    this.start = start;
    visited = new int[g.v()];
    parent = new int[g.v()];
    Arrays.fill(parent, -1);
    calDfs(visited, parent, start);
  }

  private void calDfs(int[] visited, int[] parent, int node) {
    visited[node] = 1;
    for (int i : g.adj.get(node)) {
      if (visited[i] == 0) {
        parent[i] = node;
        calDfs(visited, parent, i);
      }
    }
  }

  boolean connected(int v) {
    return visited[v] == 1;
  }

  void printPath(int v) {
    if (!connected(v)) {
      System.out.println("No path to " + v);
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
    }
    System.out.println();
  }
}
