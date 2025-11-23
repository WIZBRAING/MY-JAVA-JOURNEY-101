
package singledarray;
import java.util.Scanner;

/**
 *
 * @author tsikp
 */
public class SingleDarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students:");
        int a = input.nextInt();
         System.out.println("enter the scores of the students:");
          int[] score = new int[a];
           for (int i=0;i<a;i++)
           {
               score[i]=input.nextInt();
           }
           String[] names = new String[a];
               System.out.println("enter student names according to scores:");
                for (int i=0; i<a; i++)
                {
                    names[i] = input.next();
                } 
          
                      sortStudents(names,score);
                       for(String e:names){
                           System.out.println(e);
                       }
                       bubbleSort(score); 
                         isSorted(score);
                           reviseSelectionSort(score);
                        
               
        
        
    }
    ////////////////////////////////////////////////////////////////////////////
    /////METHODS
       /*
            analyzingNumbers()
              deckOfCards()
                forEachLoop()
                  printArray(int[] ifel)
                   errInDeckOfCards()
                    arraycopy()
                      ranNum(int[] ri)
                        reverseArray(int[] list)
                         int binSearch(int[] bs,int key)
                            binaSearch(int[]bs,int key)
                               varLenArgument(double...a )
                                 selectionSort(double[] num)
    ////////////////////////////////////////////////////////////////////////////
    //ARRAY EXERCISES
           exercise_7_3(Count occurrence of numbers) 
            exercise_7_4(Analyze scores)
             exercise_7_5(Print distinct numbers)
              exercise_7_7()
               average()
                min(7.9)
                 indexOfSmallestElement(7.10)
                   standardDeviation (7.11)
                    reversArray()
                     getRandom()
                      gcd
                       eliminatDuplicate
                        generateArray()
                         key()
                          linearSearchTime(int[] arr, int ke)
                            binarySearch(int[] arr, int ke)
                             generateKey()
                              generateArray()
                          ?    sortStudents(int[] score, String[] name)
                                bubbleSort()
                                 isSorted();
                                  hangman()
    
                           
                  
    ////////////////////////////////////////////////////////////////////////////

      */
    ////////////////////////////////////////////////////////////////////////////

    
    public static void analyzingNumbers()
    {
       Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ITEMS");
        int item = input.nextInt();
        int [] number = new int[item];
        System.out.println("ENTER THE NUMBERS");
        
        int sum=0;
        for (int i=0;i<item;i++)
        {
            number[i]=input.nextInt();
            sum +=number[i];
        }
        
        int[] list = new int[item];
        int count =0;
        for (int i=0; i<item; i++)
        {
            if (number[i]>(sum/item))
            {
                list[count] = number[i];
                count ++;
                
            }
        }
        
        System.out.println("the average is "+  (sum/item));
        System.out.println("number of elements greater than the average is "+count);
        System.out.println("the numbers greater than the average are ");
        for (int i=0;i<count;i++)
        {
            System.out.printf("%-6d,",list[i]);
        } 
        
    }
     
    public static void deckOfCards()
    {
                String[] suits = new String[]{"Spades","Hearts","Diamonds","Clubs"};
         String[] ranks = new String[]{"Ace","2","3","4","5","6","7","8","9",
             "Jack","Queen","King"};
                 int [] deck = new int[52];
                    for (int i=0; i<deck.length;i++)
                    {
                        deck[i]=i;
                    }
            //shuffling the cards
            for (int i=0; i<deck.length;i++)
            {
                int a= (int)(Math.random()*deck.length);
                
                  int temp = deck[i];
                     deck[i]=deck[a];
                       deck[a]=temp;
            }
            
            //Displaying the first four cards 
            for (int i=0;i<4;i++)
            {
               String suit= suits[deck[i]/13];
                 String rank = ranks[deck[i]%13];          
                  System.out.println("Card number "+ deck[i]+": "+rank+ ""
                          + " of " +suit);              
            }
        
        
    }
    
    
    public static void forEachLoop()
    {
        int[] arL = new int[50];
        for (int i=0; i<arL.length;i++) 
        {
            arL[i] = (int)(Math.random()*arL.length);
        }
         for (int e:arL)
         {
             System.out.print(e);
         }
     
    }
    
    public static void printArray(double[] ifel)
    {
        int[] result = new int[ifel.length];
        System.arraycopy(ifel, 0, result, 0, ifel.length);

        for (int e:result)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
    
    
    public static void errInDeckOfCards()
    {
         String[] suit= new String[]{"Spar","Yete","Kalo","Ekuli"};
          String[] rank= new String[]{"Ace","2","3","4","5","6","7",
            "8","9","Jack","Queen","King"}; 
               int[] deck=new int[52];
               
               //Assigning values to deck 
               for (int i=0; i<deck.length;i++)
               {
                   deck[i] = i;
               }
               
               for (int i=0;i<deck.length;i++)
               {
                   // Generating a random index
                   int j= (int)(Math.random() *deck.length);
                     //shuffling the deck of cards
                      int temp = deck[i];
                        deck[i] = deck[j];
                           deck[j] = temp;
               }
               
               
               for (int i=0;i<4;i++)
               {
                   System.out.println("Card number "+deck[i] + ": is "+ 
                           (rank[deck[i]%13]) +" of "+ suit[deck[i]/13]);
               }
        
        
        
    }
    
    /**
     *
     */
    public static void iarrayCopy()
    {
                
        int[] src = new int[50];
        for (int i=0;i<src.length;i++)
        {
            src[i]= (int)(Math.random()*src.length);
            
        }
        int[] csrc = new int [50];
        
        System.arraycopy(src, 0, csrc, 0, src.length);
        
        for (int e:src)
        {
            System.out.print(e+" ");
        }
        System.out.println();
        for (int e:csrc)
        {
            System.out.print(e+" ");
        }
    }
    
    
    public static int[] ranNum(int[] ri)
    {
        int[] result = new int[ri.length];
        for (int i=0; i<ri.length;i++)
        {
            result[i] =(int) (Math.random()*ri.length);
        }
        return result;
    }
    
    
    
    public static double[] reverseArray(double[] ra)
    {
        double[] result = new double[ra.length];
        for (int i=0,j=ra.length-1;i < ra.length; i++, j--)
        {
            result[j] = ra[i];
        }
        return result;
    }
    
    
   public static int[] reverseArray(int[] num)
   {
       int[] result = new int[num.length];
       for (int i=0,j=(num.length-1);i<num.length ; i++,j--)
       {
           result[j]=num[i];
       }
       return result;
   }
   
   
    public static int binSearch(int[] bs,int key)
    {
        int low =0;
        int high = bs.length-1;
        
        while (high>=low)
        {
            int mid =(low+high)/2;
            if(key<bs[mid])
            {
                high =mid-1;
            }
            else if(key==bs[mid])
            {
                return mid;
            }
            else 
                low = mid+1;
        }
        
        return -1;
    }
    
            public static int binaSearch(int[]bs,int key)
        {
            int low=0;
            int high= bs.length-1;
            for (int i=0; i<=high;i++)
            {
                int mid=(low+high)/2;
                if (key<bs[mid])
                {
                    high= mid-1;
                }
                else if (key==bs[mid])
                {
                    return mid;
                }
                else 
                    low = mid+1;
            }
            
            return -low-1;
        }
    
    
    public static void varLenArgument(double...a )
    {
        a=reverseArray(a);
        
         int count=0 ;
        while (count <a.length)
        {
            System.out.printf("%-4.1f",a[count]);
            count++;
        }
        
    }
    
    
    public static int[] selectionSort(int[] num)
    {
        for (int i=0; i<num.length-1; i++)
        {
            int currentMinVal = num[i];
            int CurrentMinIndex =i;
            
            for(int j=i+1; j<num.length; j++)
            {
                if (currentMinVal>num[j])
                {
                    currentMinVal = num[j];
                     CurrentMinIndex = j;
                }
            }
            
            if(CurrentMinIndex != i)
            {
                num[CurrentMinIndex] = num[i];
                num[i] = currentMinVal;
            }
            
        }
        return num;
    }
  
    
    public static int[] sortArray(int[] arr)
    {
        int[] sortedArray = new int[arr.length];
        for (int i=0; i< arr.length-1; i++)
        {
            int minValue=arr[i];
            int minIndex = i;
            for (int j=i+1;j<sortedArray.length;j++ )
            {
                if(minValue > arr[j])
                {
                    minValue = arr[j];
                    minIndex =j;
                }
                
            }
            if (minIndex != i)
            {
                arr[minIndex] = arr[i];
                arr[i] = minValue;
                
            }
                
        }
        sortedArray = arr;
            return sortedArray;
    }
    
    public static void exercise_7_3()
    {
       Scanner input = new Scanner(System.in);
        int[] num = new int [99];
         int[] count = new int[num.length];
           System.out.println("ENTER AN INTEGER NUMBERS BETWEEN 1 AND 100");
             for (int i=0; i<num.length;i++)
             {
                 int temp = input.nextInt();
                   if (temp ==0)
                   {
                       break;
                   }
                   else if (temp <2 || temp >num.length)
                   {
                       System.out.println("invalid input. please try again ");
                       break;
                   }
                   num[i]= temp;
                   
             }
             
             //counting the numbers 
             for (int i=0; i<num.length;i++)
             {
                 if (num[i]==0)
                 {
                     continue;
                 }
                 count[num[i]-2]++;
             }
            
             // displaying the numbers 
            for (int i=0;i<num.length;i++)
            {
                if (count[i]==0)
                {
                    continue;
                }               
                if ( count[i]>1)
                {
                    System.out.println((i+2)+ " occurs " + count[i] + " times");
                }
                else 
                    System.out.println((i+2)+ " occurs " + count[i] + " time");
            }
    }
    
    
    public static void exercise_7_4()
    {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
         int averageScore;
          int highScoreCount =0;
            int lowScoreCount =0;
             System.out.println("PLEASE ENTER THE SCORES");
              int totalScore = 0;
              int counts=0;
              //receiving score input and calculating total score
             for (int i=0;i<scores.length;i++)
             {
                 int tempScore = input.nextInt();
                 if (tempScore < 0 || i>= scores.length )
                 {
                     break;
                 }
                 //score input
                 scores[i] = tempScore;
                 //calculating total score 
                   totalScore +=scores[i];
                     counts++;
                 
               
                 
             }
              
              if (counts !=0)
              {
                  //calculating score average
                  averageScore = totalScore/counts;
              
              
              //counting scores equal to or above or below average Score
             for (int i=0; i<counts;i++)
             {
                 if (scores[i] >= averageScore)
                 {
                     highScoreCount++;
                 }
                 else 
                 {
                     lowScoreCount++;
                 }
             }
          
             //displaying output 
             System.out.println("there are " + counts + " Score(s) entered");
               System.out.println("the total score is "+ totalScore +" "
                 + "and the average is " + averageScore);
                   System.out.println(highScoreCount+" are above averege");
                    System.out.println(lowScoreCount +" are below average");
                    
             }
              else
              {
                  System.out.println("invalid input?? please try again.");
              }
    }
            
    
    
    
    
    
    public static void exercise_7_5()
    {
        Scanner input = new Scanner (System.in);
         int[] numbers = new int[10];
          int count =0;
           System.out.println("please enter the numbers");
           for (int i=0; i<numbers.length;i++)
           { 
               int temp = input.nextInt();
               if (i>0)
               {   boolean notFound = true; 
                   for (int j=i; j>=0; j--)
                   {
                       if(temp ==numbers[j])
                       {
                           notFound = false;

                       }
                   }
                   
                   if (notFound)
                   {
                        numbers[i]=temp;
                        count++;
                   }
                   
               }
               else if (i==0)
               {
                   numbers[i]= temp;
                   count++;
               }
           }
           System.out.println("the number of distinct number is "
             +count);
              System.out.print("the distinct numbers are:");
               for (int i=0; i<numbers.length;i++)
               {
                   if(numbers[i]==0)
                   {
                       continue;
                   }
                         System.out.print(numbers[i]+" ");
                   
               }
    }
    
    
    public static void exercis_7_6()
    {
        int count =0;
        int number = 0;
         int totalPrime = 50;
          int[] primeNumbers = new int[totalPrime];
            while (number < totalPrime)
            {
                boolean isPrime = true;
                  for (int div=0;div<=Math.sqrt(number);div++)
                  {
                      if (number % primeNumbers[div]==0)
                      {
                          isPrime =false;
                            break;
                      }
                  }
                  
                  if (isPrime)
                  {
                     
                      primeNumbers[count] = number;
                         count++;
                  }
                  
            }
           
        
    }
    
    
    public static void exercise_7_7()
    {
        int[] counts = new int[9];
         int[] numbers = new int[100];
          for (int i=0; i<numbers.length;i++)
          {
              int temp =(int)(1 + Math.random() * 8);
               numbers[i] = temp;     
                System.out.print(numbers[i]+" ");
          }
          
          for (int i=0;i<numbers.length;i++)
          {
              counts[numbers[i]-1]++;
          }
          
          for (int i=0;i<counts.length-1;i++)
          {
              if (counts[i]==0)
              {
                  continue;
              }
              else if(counts[i] > 1)
              {
                  System.out.println((i+1)+" occurs "+ counts[i] +" times");
              }
              else
              {
                  System.out.println((i+1)+" occurs "+ counts[i] +" time");
              }

          }
    }
    
    
    
    
    public static int average(int[] number)
    {
       int count=0;
        int sum=0;
          for (int i=0;i<number.length;i++)
          {
              if (number[i]>0)
              {
                  sum += number[i];
                   count++;
              }
          }
           System.out.println("the average is " +sum/count);
          return (sum/count);
    }
    
    
    public static double average(double[] number)
    {
       int count=0;
        int sum=0;
         for (int i=0; i< number.length;i++)
         {
             if (number[i]>0)
             {
                 sum += number[i];
                  count++;
             }
             
         }
          System.out.println("the average is "+(sum/count));
         return (sum/count);
    }
    
    
    public static double min(double[] number)
    {
         double result = number[0];
         for (int i=0;i<number.length;i++)
         {
             if(number[i]<result)
             {
                 result = number[i];
             }
         }
         System.out.println("the minimum number is "+result);
            return result;
    }
    
    
    
    public static int indexOfSmallestElement(double[] array)
    {
         int smallestIndex=0;
          double smallestElement=array[0];
             for (int i=0;i<array.length;i++)
             {
                 if(smallestElement>array[i])
                 {
                     smallestElement = array[i];
                      smallestIndex =i;
                 }
             }
             System.out.println("the index of the smallest Element is "+
                     smallestIndex);
                           return smallestIndex;
    }
    
    public static double standardDeviation(double[] array)
    {
        double sDeviation ;
         double b=0;
          double result ;
           double a;
             for(int i=0; i<array.length;i++)
             {
                a =array[i]-mean(array);
                 b += Math.pow(a, 2);
                         
             }
             a=array.length-1;
               result = b/a;
                 sDeviation = Math.sqrt(result);
                   System.out.printf("the mean is %2.2f\n",mean(array));
                     System.out.printf("the standard Deviation is %2.2f\n ",
                        sDeviation);
                           return sDeviation;
    }
    
    
    public static double mean(double[] array)
    {
        double sum=0;
         double mean;
          int count =0;
           for (int i=0; i<array.length;i++)
           {
               if (array[i]>0)
               {
                   sum += array[i];
                     count++;
               }
               
           }
              mean = sum/count;
                // System.out.println("the mean is "+mean);
                     return mean;
    }
    
    
    public static double[] revArray(double[] array)
    {
        double[] temp = new double[array.length];
        for (int i=0, j= array.length-1; i < array.length; i++,j--)
        {
            temp[j]=array[i];
        }
              array = temp;
                 return array;
    }

    
    
    public static void printArrays(double[] array)
    {
        for (int i=0; i< array.length;i++)
        {
            System.out.printf("%-4.0f", array[i]);
        }
    }
    
    
    public static int getRandom(int... numbers) 

    {
        int result = 0;
         boolean isCorrect = true;
        while(isCorrect)
        {
            isCorrect = false;
            for (int j=0;j<numbers.length;j++)
            {
            result = (int)(1+Math.random()*53);
           
            }
            for (int i=0;i<numbers.length;i++)
            {
                if(result ==numbers[i])
                {
                    isCorrect = true;
                     break;
                }
            }
          

        }
           System.out.println(result);
                  return result;
    }
    
    
    public static int gcd(int...numbers)
    {
        int gcd=1;
             for(int i=1; i<=numbers[numbers.length-numbers.length];i++)
             {
               boolean isGcd=true;
                 for(int j=0;j<numbers.length;j++)
                 {
                     if (numbers[j]%i !=0)
                     {
                         isGcd =false;
                     }
                 }
                 if(isGcd)
                 {
                     gcd=i;
                 }

             }
             System.out.println(gcd);
               return gcd;
    }
    
    
   public static int[] eliminatDuplicate(int[] list)
   {
       int[] result1 =  new int[list.length];
         int count =0;
            for (int i=0; i<result1.length;i++)
           {
               boolean notFound = true;
                for(int j=0; j<=count;j++)
               {
                    if (list[i] == result1[j])
                   {
                       notFound = false;
                         break;
                   }
               }
                if(notFound)
                {
                    result1[count] = list[i];
                      count++;
                }
           }
            int[] result = new int[count];
        System.arraycopy(result1, 0, result, 0, count);
           System.out.println(java.util.Arrays.toString(result));
              return result;
   }
    
   
   public static double linearSearchTime(int[] arr, int ke)
   { 
       double startTime = System.currentTimeMillis();
       double endTime=0;       
       int[] array = arr;
       int key = ke;
          for (int i=0; i<array.length;i++)
          {
              if (key==array[i])
              {
                  endTime = System.currentTimeMillis();
              }
          }
          double searchTime = endTime-startTime;
            System.out.println("The linear Search time is "+(searchTime));
              return searchTime;
   }
    
    
   public static double binarySearch(int[] arr, int ke)
   {
       double startTime = System.currentTimeMillis();
       double endTime =0;
       int[]array = arr;
       java.util.Arrays.sort(array);
       int key = ke;
       for (int i =0; i<array.length;i++)
       {
           if (key==array[i])
           {
               endTime = System.currentTimeMillis();
           }
       }
       double searchTime = endTime-startTime;
         System.out.println("the binary search time is "+ searchTime);
             return searchTime;
   }
   
    public static int generateKey()
    {
        int result = (int)(1+Math.random()*100000);
        return result;
    }
    
    public static int[] generateArray()
    {
        int [] array = new int[100000];
          for (int i=0; i<array.length;i++)
          {
              array[i] = (int)(1+Math.random()*array.length);
          }
           return array;
    }
    
    
    
    
     
 public static void sortStudents(String[] names, int[] scores) {
    boolean swapped;
    for (int i = 0; i < scores.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < scores.length - i - 1; j++) {
        if (scores[j] < scores[j + 1]) {
          // Swap scores and names together (maintain association)
          int tempScore = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = tempScore;

          String tempName = names[j];
          names[j] = names[j + 1];
          names[j + 1] = tempName;

          swapped = true;
        }
      }
      // No swaps in this pass means the list is already sorted
      if (!swapped) {
        break;
      }
    }
  }

    
    
    
    
    public static int[] bubbleSort(int[] num){
        int[] result= num;
        for (int i=0; i<result.length;i++){
            for (int j=1; j<result.length;j++){
                if(result[j-1]>result[j]){
                    int temp = result[j-1];
                       result[j-1] = result[j];
                         result[j] = temp;
                }
            }
        }
        for(double e:result){
            System.out.print(e+" ");
        }
        System.out.println();
        return result;
    }
    
    
    
    public static boolean isSorted(int[] num){
        int len= num.length;
        for (int i=0; i<len-1; i++){
            if (num[i]>num[1+i]){
                return false;
            }
        }
        return true;

    }
    
    
    
    
    public static int[] reviseSelectionSort(int[] list){
         int[] list2 = new int[list.length];
          list2 = list;
           int[] result = new int[list2.length];
            for(int i=0;i<result.length;i++){
             int max=list2[i];
              int maxIndex=i;
               for (int j=1;j<result.length;j++){
                 if(max<list2[j]){

                     
                   }
               }
            
            
 
               
               if (maxIndex != i)
               {
                  list2[maxIndex] = list2[i];
                    list2[i] = max;
               }

         }
                for(int e:result){
                    System.out.print(e+" ");
                }
                        return result;
                        
    }
    
    
 
    //Programming Exercise 7.35////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    
    public void hangman(){
        Scanner input = new Scanner(System.in);
        String word = guessWord();
        char[] letter = word.toCharArray();
        int countErrors =0;
        StringBuilder match = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            match.append("*");
        }
        
        
        for(int i=0; i<word.length(); i++){
            System.out.print("Enter a letter in word "+ match+" > ");
            boolean guessedRight =false;
            String letterRead = input.next();
            
            for(int j=0; j<word.length(); j++){
                if(letterRead.charAt(0)==letter[j] && 
                        match.charAt(j)=='*'){
                  
                    match.setCharAt(j, letterRead.charAt(0));
                    guessedRight =true;
                    
                } else if(letterRead.charAt(0)==letter[j] && 
                        match.charAt(j)!='*'){
                    
                    System.out.print(letterRead.charAt(0)+
                            " is already in the word\n");
                } else if(letterRead.charAt(0)==letter[j]){

                }
            }
            
            if(!guessedRight){
                     System.out.print(letterRead.charAt(0)+
                             " is not in the word\n");
                countErrors++;
            }
            
            if(word.equals(match.toString())){
                System.out.println("You got it correct");
                break;
            }
        }
         
        System.out.println("The word is "+word+". You missed "+countErrors+""
                + " time(s)\nDo you want to try again. Yes or No : ");
        if(input.next().toLowerCase().equals("yes")){
            System.out.println();
            hangman();
        }
        
    }


    public String guessWord(){
            String[] words = {
            "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
            "honeydew", "kiwi", "lemon","mango","nectarine","orange", "papaya",
            "quince", "raspberry","strawberry", "tangerine", "ugli", "vanilla",
            "watermelon", "xigua", "yam", "zucchini", "apricot", "blueberry",
            "coconut", "dragonfruit", "eggplant", "feijoa","guava", "hazelnut", 
            "iceberg", "jackfruit", "kumquat", "lime", "mulberry", "nutmeg", 
            "olive", "peach","pear", "pineapple", "plum","pomegranate","radish",
            "spinach", "tomato","turnip", "walnut","acorn","broccoli","cabbage",
            "carrot","cauliflower","celery","chili","corn","cucumber","garlic",
            "ginger","kale", "lettuce", "mushroom", "okra", "onion", "parsley", 
            "pea", "pepper", "potato","pumpkin","shallot","squash","sweetcorn", 
            "sweetpotato","thyme","zest","basil","bayleaf","chive","cilantro",
            "dill","fennel","lemongrass","marjoram","mint","oregano","rosemary",
            "sage", "saffron", "tarragon","vanilla","wasabi", "yarrow", "zatar",
            "almond", "cashew", "pecan", "pistachio", "macadamia", "chestnut" };
               
            return words[(int)(0+Math.random()*100)];
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
}
