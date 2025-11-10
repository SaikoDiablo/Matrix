public class Main {
    public static void main(String[] args) {
        int size =10; 
        int[][] matrix = new int [size][size];
       
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
              matrix[i][i]=i;
              System.out.print(matrix[i][j] + " ");
            }
         System.out.println();  
        }

        int sum =0;
          for(int i=0; i<10;i++)
          sum+=matrix[i][i];
        System.out.println("Sum of diagonal:"+sum);  
    }
}    
