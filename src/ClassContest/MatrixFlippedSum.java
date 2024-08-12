package ClassContest;

import java.util.Scanner;

public class MatrixFlippedSum {

    public static void getSum(int[][] matrix){
        int sum_before=0, sum_after=0;

        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                sum_before = sum_before+matrix[row][col];
            }
        }
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        //flipping and storing sum
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col] == 0){
                    matrix2[row][col] = 1;
                }
                if(matrix[row][col] == 1){
                    matrix2[row][col] = 0;
                }
                sum_after = sum_after + matrix2[row][col];
            }
        }

        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                System.out.print(matrix2[row][col]+" ");
            }
            System.out.print("\n");
        }

        System.out.print(sum_before+" ");
        System.out.print(sum_after+" ");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j] = s.nextInt();
            }
        }

        getSum(matrix);
    }
}
