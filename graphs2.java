import java.util.*;

public class graphs2 {
    private Map<String,List<String>> adjacencyList=new HashMap<>();

    public graphs2(){
        adjacencyList=new HashMap<>();
    }
    public void addEdge(String a,String b){
       adjacencyList.putIfAbsent(a,new ArrayList<>());
       adjacencyList.putIfAbsent(b,new ArrayList<>());
       adjacencyList.get(a).add(b);
       adjacencyList.get(b).add(a);
    }
    public void print(){
        for(String Person:adjacencyList.keySet()){
            System.out.println(Person+"="+adjacencyList.get(Person));
        }
    }
    public static void main(String[] args) {
        graphs2 gr=new graphs2();
        gr.addEdge("rc"," ntr");
        gr.addEdge("rc","aa");
        gr.addEdge("rc","prabhas");
        gr.addEdge("prabhas","rapo");
        gr.addEdge("prabhas","rana");
        gr.print();
    }

    
}

