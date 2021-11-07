import java.util.Scanner;
public class PrimAlgo{
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int[][] edges = new int[V][V];
        for(int i=0;i<E;i++) {
            int sv = s.nextInt();
            int ev = s.nextInt();
            int weight = s.nextInt();
            edges[sv][ev] = weight;
            edges[ev][sv] = weight;
        }
        prims(edges);


    }

    public static void prims(int[][] edges) {
        int[] parent = new int[edges.length];
        boolean[] visited = new boolean[edges.length];
        int[] weight = new int[edges.length];
        parent[0] = -1;
        weight[0] = 0;
        for(int i=1;i<weight.length;i++) {
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<edges.length;i++) {

            int minVertex = findMinWeightNotVisted(weight,visited);
            visited[minVertex] = true;
            for(int j=0;j<edges.length;j++) {
                if(edges[minVertex][j] !=0  && !visited[j]) {
                    if( edges[minVertex][j] < weight[j] ) {
                        weight[j] = edges[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }

        }

        for(int i=1;i<weight.length;i++) {
            if( i > parent[i])
                System.out.println( parent[i] +" " + i+" " +weight[i]  );
            else
                System.out.println( i +" " + parent[i]+" " +weight[i]  );
        }



    }

    public static int findMinWeightNotVisted(int[] weight, boolean[] visited) {
        int minIndex = 0;
        int minWeight = Integer.MAX_VALUE;
        for(int i=0;i<weight.length;i++) {
            if(!visited[i] && minWeight > weight[i]) {
                minWeight = weight[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}