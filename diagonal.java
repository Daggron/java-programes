import java.util.Scanner;
class diagonal {
    static final int ROW = 5;
    static final int COL = 4;

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }


    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static void diagonalOrder(int matrix[][]) {


        for (int line = 1; line <= (ROW + COL - 1); line++) {

            int start_col = max(0, line - ROW);


            int count = min(line, (COL - start_col), ROW);

            for (int j = 0; j < count; j++)
                System.out.print(matrix[min(ROW, line) - j - 1]
                        [start_col + j] + " ");

            System.out.println();
        }
    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R,C;
        R=sc.nextInt();
        C=sc.nextInt();
        int M[][] = new int[R][C];
        for(int i=0;i<R;i++) {
           for(int j=0;j<C;j++)
           {
               M[i][j]=sc.nextInt();
           }
        }
        System.out.print("\nDiagonal printing of matrix is \n");
        diagonalOrder(M);
    }
}