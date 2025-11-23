
package multidarray;
import java.util.Scanner;
import java.util.Random;

public class MultiDarray {


    public static void main(String[] args) 
    {
        Random rand = new Random(3);
         int a= rand.nextInt();



        
        
                     
      
          
    }//end of main
    /*//////////////////////////////////////////////////////////////////////////
                   createArray();
                    createRanArray();
                     printMultiArray();
                      sumArray();
                       shuffleArray ();
                         printMaxSum(matrix);
                           randomChArray();
                            key();
                              grade();
                               scoreTest()
                                distance(x1,y1,x2,y2)
                                  findNearestPoint()
                            
    *///////////////////////////////////////////////////////////////////////////
    
    
       //Mehtod for creating arrays
    public static int[][] createArray(){
        int[][] matrix;
        try (java.util.Scanner input = new Scanner (System.in)) {
            System.out.println("enter the number of rows and columns "
                    + "of the array "+"\nyou want to create");
            int b=input.nextInt();
            int a=input.nextInt();
            matrix = new int[b][a];
            System.out.println("Enter an array with " + matrix.length+ " rows and"
                    + " "+matrix[0].length);
            for (int[] matrix1 : matrix) {
                for (int column = 0; column < matrix1.length; column++) {
                    matrix1[column] = input.nextInt();
                }
            }
        }
          return matrix;
    }
    
    
    
       //Method for initializing multi Array with random values;
    public static int[][] createRanArray(){
        System.out.println("Enter the rows and columns of the array");
         java.util.Scanner input = new Scanner(System.in);
          int r=input.nextInt();
           int c= input.nextInt();
             int[][] matrix =new int [r][c];
               for (int[] matrix1 : matrix) {
                  for (int column = 0; column < matrix1.length; column++) {
                     matrix1[column] = (int)(Math.random()*100);
                    }
               }
           return matrix;
    }
    
    
    
        //Method for printing multi Array;
    public static void printMultiArray(int[][] array){
        for(int[] array1:array){
            for(int column=0;column<array1.length;column++){
                System.out.print(array1[column]+" ");
            }
            System.out.println();
        }
    }
    public static void printMultiArray(char[][] array){
        for(char[] array1:array){
            for(int column=0;column<array1.length;column++){
                System.out.print(array1[column]+" ");
            }
            System.out.println();
        }
    }
    
    
    
         //Method for summing multi array;
    public static int sumArray(int[][] array){
        int result =0;
          for(int[] array1:array){
              for(int column=0; column<array1.length;column++){
                  result +=array1[column];
              }
          }
           System.out.println("the sum of the array is: "+result);
          return result;
    }
    
        //Method for shuffling Multi Array;
    public static int[][] shuffleArray (int[][] array){
        for(int[] array1:array){
            for(int column=0; column<array1.length; column++){
                int ran = (int)(Math.random());
                  int temp = array1[column];
                    array1[column] = array1[ran];
                      array1[ran]=temp;
            }
        }
        return array;
    }
    
    
    ///Method for calculating the maximum sum of a row
    public static void printMaxSum(int[][] array){
        int maxRow = 0;
        int indexMaxRow =0;
        for (int column=0; column<array[0].length;column++){
             maxRow +=array[0][column];
        }
        
        for (int row=1; row<array.length; row++){
            int sum =0;
            for(int column=0; column<array[row].length;column++){
                sum +=array[row][column];
                if(maxRow<sum){
                    maxRow =sum;
                    indexMaxRow = row;
                }
            }
        }
      System.out.println("row " + indexMaxRow+ " has a maximum sum of "+maxRow);
    }
    
    
    
    ///Method for generating random character Array
    public static char[][] randomChArray(){
        char[][] answers;
        java.util.Scanner input= new Scanner(System.in);
        System.out.println("enter the row and column of the Character array");
        int row=input.nextInt();
        int column = input.nextInt();
        answers = new char[row][column];
        for(int i=0;i<row;i++){
            for (int j=0; j<column;j++){
                answers[i][j]=(char)('a'+Math.random()*('z'-'a'+1));
            }
        }
        return answers;
    }
    
    
    
    ///Method for generating random character key
    public static char[] key(char[][] array){
        char[] key=new char[array[0].length];
         for (int i=0; i<key.length;i++){
             key[i] = (char)('A'+Math.random()*'B');
         }
         System.out.println("the key is:");
         for(char e:key){
         System.out.print(e+ " ");
         }
         System.out.println();
         return key;
    }
    
    
    
    
    ///Method for grading character array
    public static int[] grade(char[][] array, char[] key){
        int[] score = new int[key.length];
        for(int row=0; row<array.length;row++){
            for(int column=0; column<array[row].length;column++){
                if(array[row][column]==key[column]){
                    score[row]++;
                }
            }
        }
        return score;
    }
    
    
    public static void scoreTest(){
                char[][] score = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}
        };
    
        
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
        
        for (int row=0;row<score.length;row++){
            int marks=0;
            for (int column =0; column<score[row].length;column++){
                if(score[row][column]==keys[column]){
                    marks++;
                }
            }
            System.out.println("student "+row +" score "+ marks);
        }
    }
    
    
    //for finding distance between two points 
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));   

}   //for finding two nearest points 
    public static void findNearestPoint(){
        java.util.Scanner input = new Scanner(System.in);
         System.out.println("enter the number of points");
          int num = input.nextInt();
           double[][] points= new double[num][2];
            System.out.println("enter "+ num +" points:");
             for (int row=0; row<points.length;row++){
                for(int column=0;  column<2;column++){
                    points[row][column]=input.nextDouble();
                    
                }
             }
              
                
           int p1=0, p2=1;
            double shortestDistance = distance(points[p1][0], points[p1][1], 
              points[p2][0], points[p2][1]);
                for(int row=0;row<points.length;row++){
                    for(int nextRow= row+1;nextRow<points.length;nextRow++){
                        double distance = distance(points[row][0], points[row][1],
                            points[nextRow][0],points[nextRow][1]);
                        if(shortestDistance > distance){
                            p1=row;
                            p2=nextRow;
                            shortestDistance = distance;
                        }
                    }
                    
                }
           System.out.println();
           System.out.println("the closest two points are: ("+points[p1][0]+","
            +points[p1][1]  +") and (" + points[p2][0]+","+ points[p2][1] +")");
    }
    
    
    
    
    public static void closestPair(){
        System.out.println("ENTER THE NUMBER OF STUDENTS");
         java.util.Scanner input = new Scanner(System.in);
           double[][] points = new double[(int)input.nextDouble()][2];
             System.out.println("ENTER "+points.length+" POINTS");
        for (double[] point : points) {
            for (int column = 0; column < point.length; column++) {
                point[column] = input.nextDouble();
            }
        }
           int p1=0,  p2=1;
           
            double shortDistance = distance( points[p1][0], points[p1][1], points[p2][0],
                   points[p2][1]);
            for (int row=0; row<points.length;row++){
                for(int nextRow=row+1;nextRow<points.length;nextRow++){
                    double dist = distance(points[row][0],points[row][1],
                            points[nextRow][0],points[nextRow][1]);
                    if (shortDistance >dist){
                        p1 = row;
                        p2 = nextRow;
                        shortDistance = dist;
                    }    
                }
            }
        
    }
    
    
    public static double[][] addMatrix (double[][] a, double[][] b){
        double[][] result = new double[a.length][a[0].length];
         for(int row=0; row<result.length;row++){
             for(int column=0; column<result[0].length; column++){
                 result[row][column] = a[row][column]+b[row][column];
             }
         }
         return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
}// end of class


