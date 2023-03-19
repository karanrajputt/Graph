import java.util.*;

import javax.sound.sampled.BooleanControl;
public class Graph {
    private int V;
      private LinkedList<Integer>adj[];
      private Queue<Integer>queue;
      //create a graph
     public Graph(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();

        }
        queue=new LinkedList<Integer>();
      }

      //Add edge to the graph
      void addEdge(int v,int w){
        adj[v].add(w);

      }
       void BFS(int n){
        boolean nodes[]=new boolean[V];
        int a=0;
        nodes[n]=true;
        queue.add(n);
        while(queue.size()!=0){
          n=queue.poll();
        System.out.print(n+"");
        
        for(int i=0;i<adj[n].size();i++){
            a=adj[n].get(i);
            if(!nodes[a]){
              nodes[a]=true;
                queue.add(a);
            }
        }
       }}
       public static void main(String[] args) {
              Graph graph=new Graph(4);
              graph.addEdge(0,1);      
              graph.addEdge(0,2);
              graph.addEdge(0,3);
              graph.addEdge(2,0);
              graph.addEdge(0,1);
             System.out.println("dfs is as foollows");
              graph.BFS(0);
      }

}
