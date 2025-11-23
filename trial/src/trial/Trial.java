
package trial;
import java.util.Scanner;
/**
 *
 * @author tsikp
 */
public class Trial 
{
    public static void main(String[] args) 
    {
        double[][] mat1=createMatrix(3,3);
         double[][] mat2= createMatrix(3,3);
          fillMatrix(mat1);
           fillMatrix(mat2);
            printMatrix(addMatrix(mat1,mat2));
          
        System.out.print("");
         
        
           
    }//end of main
    /*//////////////////////////////////////////////////////////////////////////
                sumColumn(dble[][] a, int col);
                  createMatrix(int r, int c);
                    fillMatrix([][]);
                      sumDiagonal();
                       answers();
                         key();
                           sortStudents();
                             printResult();
                              addMatrix();
    
    *///////////////////////////////////////////////////////////////////////////
      
    
    public static double sumColumn (double[][] m, int columIndex){
        double sum =0;
        for (int r=0;r<m.length;r++){
            sum+= m[r][columIndex];
        }
              return sum;
    }
    
    public static double[][] createMatrix(int r, int c){
        double[][] grid= new double[r][c];
          return grid;
    }
    
    public static double[][] fillMatrix(double[][] m){
        
          System.out.println("enter the values for the "+m.length+" by "+
                m[0].length  +" matrix");
            java.util.Scanner input = new Scanner (System.in);
              for (int i=0; i<m.length;i++){
                  for (int j=0; j<m[i].length; j++){
                      m[i][j] = input.nextDouble();
                  }
              }
              return m;
    }
    
    public static double sumDiagonal(double[][] a){
        double sum =0;
         for (int row=0; row<a.length;row++){
            for(int column=0;column<a[row].length;column++){
                if(column==row){
                    sum +=a[row][column];
                }
            }
         }
            return sum;
    }
    
    public static char[][] answers(){
        char[][] a= 
                  {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                   {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                   {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                   {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                   {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        return a;
    }
    
    public static char[] key(){
        char[] k = {'D','B','D','C','C','D','A','E','A','D'};
        return k;
    }
    
    
    
    public static double[][] sortStudents(char[][] answer, char[] key){
        double[][] score = new double[answer.length][2];
           for (int row=0; row<answer.length;row++){
               for(int col=0; col<answer[0].length;col++){
                   if(answer[row][col] == key[col]){
                       score[row][0]++;
                        score[row][1]=row;
                   }
                           
               }
           }
        
          boolean swapped;
          for(int i=0; i<score.length; i++){
            swapped = false;
              for(int j=0; j<score.length-1;j++){
                  if(score[j][0]>score[j+1][0]){
                      //sorting scores
                      double temps = score[j][0];
                        score[j][0]= score[j+1][0];
                          score[j+1][0] = temps;
                          //sorting students
                             double tempst = score[j][1];
                               score[j][1] = score[j+1][1];
                                score[j+1][1] =tempst;
                                 swapped = true;
                                 
                  }
              }
              if(!swapped){
                  break;
              }
          }
            return score;
    }
    

    
    public static void printResult(double[][] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println("sudent "+arr[i][0]+" scored "+arr[i][1]);
        }
            
    }
    
    
    
    public static double[][] workingHours(double[][] arr){
        double[][] empWorkHours = new double[arr.length][2];
          for (int i=0; i<arr.length; i++){
              for (int j=0; j<arr[i].length; j++){
                  //summing hours 
                  empWorkHours[i][1] +=arr[i][j];
                  //getting employee number
                   empWorkHours[i][0] = i;
              }
          }
          
          boolean swapped;
          for(int i=0;i<empWorkHours.length;i++){
              swapped = false;
                for(int j=0; j<empWorkHours.length-1;j++){
                    if(empWorkHours[j][1]>empWorkHours[j+1][1]){
                        //sorting sum of hours
                        double temp = empWorkHours[j][1];
                          empWorkHours[j][1] = empWorkHours[j+1][1]; 
                            empWorkHours[j+1][1] = temp;
                             //sorting employees based on sum of hours
                                double tempe = empWorkHours[j][0];
                                  empWorkHours[j][0] = empWorkHours[j+1][0];
                                   empWorkHours[j+1][0] = tempe;
                                   //element is swapped
                                      swapped = true;
                           
                          
                    }
                }
                if(!swapped) break;
                    
                
          }
                            return empWorkHours;
    }
    
    
    
    
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][a[0].length];
         for (int i=0; i<result.length;i++){
             for(int j=0;j<result[0].length;j++){
                 result[i][j] = a[i][j] + b[i][j];
             }
         }
         return result;
    }
    
    
    public static void printMatrix(double[][] mat){
        int count =0;
        for (double[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                if(count%3==0){
                    System.out.println();
                }
                System.out.print(mat1[j]+"  ");
                 count++;
            }
        }
    }
    
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][a[0].length];
         for (int i=0; i<result.length;i++){
            for(int j=0; j<result[0].length;j++){
              result[i][j] = (a[i][1]*b[1][j])+(a[i][2]*b[2][j])+(a[i][3]*b[3][j]);
            }
         }
            return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}// end of class


