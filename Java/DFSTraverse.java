import java.util.Stack;

public class DFSTraverse {
    private int num;
    private char[] vertics;
    private boolean[] vististed;
    private int[][] edges;

    public DFSTraverse(int n) {
        this.num = n;
        this.vertics = new char[n];
        this.vististed = new boolean[n];
        this.edges = new int[n][n];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                this.edges[i][j] = 1;
            }
        }
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

    private void traverse(int i) {
        vististed[i] = true;
        System.out.println(vertics[i]);
        for (int j = 0; j < num; j++) {
            if (edges[i][j] == 1 && !vististed[j]) {
                traverse(j);
            }
        }
    }

    // 递归
    public void DFSTraverse() {
        for (int i = 0; i < num; i++) {
            vististed[i] = false;
        }

        for (int i = 0; i < num; i++) {
            if (!vististed[i]) {
                traverse(i);
            }
        }
    }

    // 非递归
    public void DFSTraverse2() {
        for (int i = 0; i < num; i++) {
            vististed[i] = false;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num; i++) {
            if (!vististed[i]) {
                stack.push(i);
                while (!stack.isEmpty()) {
                    int j = stack.pop();
                    if (!vististed[j]) {
                        vististed[j] = true;
                        System.out.println(vertics[j]);

                        for (int m = num - 1; m >= 0; m--) {
                            if (edges[j][m] == 1 && !vististed[m]) {
                                stack.push(m);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFSTraverse dfs = new DFSTraverse(9);
        char[] vertices = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        dfs.setVertics(vertices);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 5);
        dfs.addEdge(1, 0);
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 6);
        dfs.addEdge(1, 8);
        dfs.addEdge(2, 1);
        dfs.addEdge(2, 3);
        dfs.addEdge(2, 8);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
        dfs.addEdge(3, 6);
        dfs.addEdge(3, 7);
        dfs.addEdge(3, 8);
        dfs.addEdge(4, 3);
        dfs.addEdge(4, 5);
        dfs.addEdge(4, 7);
        dfs.addEdge(5, 0);
        dfs.addEdge(5, 4);
        dfs.addEdge(5, 6);
        dfs.addEdge(6, 1);
        dfs.addEdge(6, 3);
        dfs.addEdge(6, 5);
        dfs.addEdge(6, 7);
        dfs.addEdge(7, 3);
        dfs.addEdge(7, 4);
        dfs.addEdge(7, 6);
        dfs.addEdge(8, 1);
        dfs.addEdge(8, 2);
        dfs.addEdge(8, 3);

        System.out.println("DFS traverse recursion");
        dfs.DFSTraverse();
        System.out.println("DFS traverse iteration");
        dfs.DFSTraverse2();
    }
}
