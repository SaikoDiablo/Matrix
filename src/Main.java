public class Main {
    public static void main(String[] args) {
        int size =10; // here we defining the size of a matrix fro not using the nested loops too much and make code cleaner
        int[][] matrix = new int [size][size];// creating a 10on10 arary

        for(int i=0; i<size;i++){ // using for loop in order to fill the diagonal with numbers
          matrix[i][i]=i;
       }
       // using for to print the matrix
        for (int i = 0; i<size; i++){// this loop is for each row
            for (int j = 0; j<size; j++){// this for each column
              System.out.print(matrix[i][j] + " ");//print matrix with space
            }
         System.out.println();  // move text to the next line for matrix to look like one 
        }

        int sum =0;// sum variable
        for(int i=0; i<10;i++)//calculate the sum
          sum+=matrix[i][i];
        System.out.println("Sum of diagonal:"+sum);  // print the sum
    }
}    
