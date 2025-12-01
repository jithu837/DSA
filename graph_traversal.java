import java.util.*;
public class graph_traversal {
    private Map <Integer,List<Integer>> adjacencyLists=new HashMap<>();
    
        public void addNode(int value){
            adjacencyLists.putIfAbsent(value, new ArrayList<>());
            
        }
        public void addEdge(int value,int u){
            
            adjacencyLists.get(value).add(u);
            adjacencyLists.get(u).add(value);
        }
        public void printGraph(){
            for(int value:adjacencyLists.keySet()){
                System.out.println(value+"->"+adjacencyLists.get(value));
            }
        }
        public void bfs(int value){
            Queue<Integer> queue=new java.util.LinkedList<>();
            Set<Integer> visited = new HashSet<>();
            queue.add(value);
            visited.add(value);
            System.out.print("BFS:");
            while(!queue.isEmpty()){
                int current=queue.poll();
                System.out.print(current+" ");
                for(int neighbour:adjacencyLists.get(current)){
                    if(!visited.contains(neighbour)){
                        visited.add(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
            System.out.println();
        }
        public void dfs(int start){
            Set<Integer> visited=new HashSet<>();
            dfsHelper(start,visited);
        }
        private void dfsHelper(int node , Set<Integer> visited){
            visited.add(node);
            System.out.print("DFS:");
            System.out.print(node+" ");
            for(int neighbour:adjacencyLists.get(node)){
                if(!visited.contains(neighbour)){
                    dfsHelper(neighbour, visited);
                }
            }
        }
      
        
        public static void main(String[] args) {
            graph_traversal graph=new graph_traversal();
            graph.addNode(1);
            graph.addNode(2);
            graph.addNode(3);
            graph.addNode(4);
            graph.addNode(5);
            graph.addEdge(1, 2);
            graph.addEdge(1,3);
            graph.addEdge(2, 4);
            graph.addEdge(3, 5);
            graph.printGraph();
            graph.bfs(1);
            System.out.println();
            graph.dfs(1);
        
        }
    }
