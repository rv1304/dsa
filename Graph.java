import java.util.ArrayList;

class Graph {

  private int v;
  private int e;
  ArrayList<ArrayList<Integer>> adj;
  
  public Graph(int v){
    this.v = v;
    this.e = 0;
    adj = new ArrayList<>();
    for (int i = 0; i < v; i++) {
      adj.add(new ArrayList<>());
    }
  }

  public void addEdge(int v, int w){
    e++;
    adj.get(v).add(w);
    adj.get(w).add(v);
  }

  public int v() {
    return v;
  }

  public int e() {
    return e;
  }
  
  public Iterable<Integer> adj(int v) {
    return adj.get(v);
  }
}
