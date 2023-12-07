// Prims Algorithm (Greedy Algorithm)
// Time Complexity: O(ElogV)
// Space Complexity: O(V)

import java.util.Arrays;

public class Prims {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 3, 0, 0, 6, 5 },
                { 3, 0, 1, 0, 0, 4 },
                { 0, 1, 0, 6, 0, 4 },
                { 0, 0, 6, 0, 8, 5 },
                { 6, 0, 0, 8, 0, 2 },
                { 5, 4, 4, 5, 2, 0 }
        };

        int n = graph.length;
        int[] parent = new int[n];
        int[] key = new int[n];
        boolean[] mstSet = new boolean[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        key[0] = 0; // Start from the first vertex

        long startTime = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        printMST(parent, graph);
        mstValue(parent, graph);

        System.out.println("Execution Time (ns): " + elapsedTime);
    }

    public static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge   Weight");
        for (int i = 1; i < parent.length; i++) {
            System.out.println(parent[i] + " - " + i + "   " + graph[i][parent[i]]);
        }
    }

    public static void mstValue(int[] parent, int[][] graph) {
        int sum = 0;
        for (int i = 1; i < parent.length; i++) {
            sum += graph[i][parent[i]];
        }
        System.out.println("MST Value: " + sum);
    }
}




