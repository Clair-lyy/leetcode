import java.util.LinkedList;
import java.util.Queue;

public class BFSTraverse {
    private int num;
    private char[] vertics;
    private int[][] edges;
    private boolean[] vististed;

    public BFSTraverse(int n) {
        this.num = n;
        this.vertics = new char[n];
        this.edges = new int[n][n];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                edges[i][j] = 0;
            }
        }
        this.vististed = new boolean[n];
    }

    public void addEdge(int i, int j) {
        if (i == j) {
            return;
        }
        edges[i][j] = 1;
    }

    public void setVertics(char[] vertics) {
        this.vertics = vertics;
    }

    public void BFSTraverse() {
        for (int i = 0; i < num; i++) {
            vististed[i] = false;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int k = 0; k < num; k++) {
            if (!vististed[k]) {
                queue.add(k);
                while (!queue.isEmpty()) {
                    int j = queue.poll();
                    if (!vististed[j]) {
                        vististed[j] = true;
                        System.out.println(vertics[j]);
                        for (int m = 0; m < num; m++) {
                            if (edges[j][m] == 1 && !vististed[m]) {
                                queue.offer(m);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSTraverse bfs = new BFSTraverse(9);
        char[] vertices = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        bfs.setVertics(vertices);

        bfs.addEdge(0, 5);
        bfs.addEdge(1, 0);
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 6);
        bfs.addEdge(1, 8);
        bfs.addEdge(2, 1);
        bfs.addEdge(2, 3);
        bfs.addEdge(2, 8);
        bfs.addEdge(3, 2);
        bfs.addEdge(3, 4);
        bfs.addEdge(3, 6);
        bfs.addEdge(3, 7);
        bfs.addEdge(3, 8);
        bfs.addEdge(4, 3);
        bfs.addEdge(4, 5);
        bfs.addEdge(4, 7);
        bfs.addEdge(5, 0);
        bfs.addEdge(5, 4);
        bfs.addEdge(5, 6);
        bfs.addEdge(6, 1);
        bfs.addEdge(6, 3);
        bfs.addEdge(6, 5);
        bfs.addEdge(6, 7);
        bfs.addEdge(7, 3);
        bfs.addEdge(7, 4);
        bfs.addEdge(7, 6);
        bfs.addEdge(8, 1);
        bfs.addEdge(8, 2);
        bfs.addEdge(8, 3);

        System.out.println("BFS traverse");
        bfs.BFSTraverse();
    }
}
