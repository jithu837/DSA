import java.util.*;

public class Graphs {
    private Map<Integer,List<Integer>> adjacencyList;
    public Graphs(){
        adjacencyList=new HashMap<>();
        }
        public void addNode(int value){
            adjacencyList.putIfAbsent(value, new ArrayList<>());
            for(int node:adjacencyList.keySet()){
                if(node!=value){
                    addEdge(node,value);
                }
            }
        }
        public void addEdge(int u,int value){
            if(!adjacencyList.containsKey(u)) addNode(u);
            if(!adjacencyList.containsKey(value)) addNode(value);
            if(!adjacencyList.get(u).contains(value)) adjacencyList.get(u).add(value);
            if(!adjacencyList.get(value).contains(u)) adjacencyList.get(value).add(u);
        }
        public void printGraph(){
            for(int value:adjacencyList.keySet()){
                System.out.println(value+"->"+adjacencyList.get(value));
            }
        }
        public boolean isConnected(int value,int u){
            if(adjacencyList.containsKey(value) && adjacencyList.get(value).contains(u)){
                return true;
            }
            return false;
        }
        public void removeEdge(int value,int u){
            if(adjacencyList.containsKey(value)){
                adjacencyList.get(value).remove(Integer.valueOf(u));
            }
            if(adjacencyList.containsKey(u)){
                adjacencyList.get(u).remove(Integer.valueOf(value));
            }
        }
        public int noofEdges(){
            int count=0;
            for(int node:adjacencyList.keySet()){
                count+=adjacencyList.get(node).size();
            }
            return count/2;
        }
        public int CountofNodes(){
            return adjacencyList.size();
            }
        public void noofConnection(){
            int count=0;
            for(int v:adjacencyList.keySet()){
                count=adjacencyList.get(v).size();
                System.out.println(v+":"+count);
            }return;
        }
        
        public static void main(String[] args) {
            Graphs graph=new Graphs();
            graph.addNode(6);
            graph.addNode(9);
            graph.addNode(3);
            graph.addNode(5);
            graph.addNode(7);
            graph.addNode(8);
            graph.printGraph();
            System.out.println(graph.isConnected(9, 3));
            //graph.removeEdge(8, 5);
            graph.printGraph();
            System.out.println(graph.noofEdges());
            System.out.println(graph.CountofNodes());
            graph.noofConnection();
        }

    }