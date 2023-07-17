import java.util.Scanner;

public class Anti_Diagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        antidiagonals(matrix,size,size2);
    }

    static void antidiagonals(int[][] matrix,int size,int size2) {
        for(int iterator=0;iterator<size2;iterator++){
            int i=0 , j=iterator;
            while(i< size && j>=0){
                System.out.print(matrix[i][j]+" ");
                i++;
                j--;
            }
            for(int k=size2-1;k>iterator;k--){
                System.out.print(0+" ");
            }
            System.out.println();
        }
        for(int iterator1=1;iterator1<size2;iterator1++){
            int i=iterator1 , j=size2-1;
            while(i< size && j>=0){
                System.out.print(matrix[i][j]+" ");
                i++;
                j--;
            }
            for(int k=iterator1;k<size2-1;k++){
                System.out.print(0+" ");
            }
            System.out.println();
        }


    }


}
