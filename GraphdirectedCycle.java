import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.*;
public class GraphdirectedCycle{
    private int V;
  private int LinkedList<Integer>adj;
  
 public GraphdirectedCycle(int v){
    V=v;
    adj=new LinkedList[v];
    for(int i=0;i<v;i++){
        adj[i]=new LinkedList<>();

    }
}
 static void addEdge(int v,int w){
    adj[v].add(w);   
}

static boolean checkCycleUtil(int node,boolean visited[],boolean inStack[]){
    if(inStack[node]) 
    return true;

    if(visited[node])
    return false;

    visited[node]=true;

    inStack[node]=true;

    for(int v:adj.get(node)){
        if(checkCycleUtil(v, visited, inStack))
        return true;
    }
    inStack[node]=false;

    return false;
}
   static boolean checkCycle(int V,int E){
    boolean visited[]=new boolean[V];
    boolean inStack[]=new boolean[V];

    for(int i=0;i<V;i++){
        if(checkCycleUtil(i, visited, inStack))
        return true;
    }
   
   return false;}

   public static void main(String[] args)throws java.lang.Exception{
    GraphdirectedCycle graph=new GraphdirectedCycle(4);
    graph.addEdge(0,1);      
    graph.addEdge(0,2);
    graph.addEdge(0,3);
    graph.addEdge(2,0);
    graph.addEdge(0,1);
          if(checkCycle(0, 0)){
          System.out.println("yes"); }
          else{
          System.out.println("no");}
}
}

