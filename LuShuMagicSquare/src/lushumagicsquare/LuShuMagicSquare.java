


/**
 *
 * @author munai
 */
public class LuShuMagicSquare 
{
  static int[][] magicArray = { {4, 9, 2},
                         {3, 5, 7},
                         {8, 1, 6} };

   static   int[][] normalArray = { {1, 2, 3},
                              {4, 50, 6}, 
                              {7, 8, 80} };
    
   
   //method to check if numbers in array between 1-9
    public static boolean isInRange(int[][] arr)
    {
        boolean flag=true;
        
        for(int r=0;r<arr.length;r++)
        {  
         for(int c=0;c<arr[r].length;c++)
         {
//               
          if(!(arr[r][c]>=1 && arr[r][c]<=9))
         {
                    flag=false;        
         }
              
         }
         
         }
        
         return flag;
    }
    
    
    
    //method to check if numbers in row and col add up to 15
    public static boolean sumRowAndCol(int[][] arr)
    {
        int sum=0;
        boolean flag=false;
        
       for(int r=0;r<arr.length;r++)
       {
    
       for(int c=0;c<arr[0].length;c++)
       { 
           
           sum+=arr[r][c];

           //total in array adds up to 45
           if(sum==45)
           {
               flag=true;
         
           
           }
           
       }
        
    }
     
     for(int r=0;r<arr.length;r++)
     {
     
       for(int c=0;c<arr[0].length;c++)
       { 
           
           sum+=arr[c][r];
           //if total adds up to 90 since they are equal
           if(sum==90)
           {
               flag=true;
          
           
           }
          
       }
        
    }
    

    
    return flag;
    }
    
    
    //method to check if array is magic
    public static boolean isMagic(int[][] arr)
    {
        boolean flag=false;
        if(sumRowAndCol(arr) && isInRange(arr))
        {
            flag=true;
        }
        
      //tocheck if diagonals equals 15
         if(arr[0][0]+arr[1][1]+arr[2][2]==15 && (arr[0][2]+ arr[1][1]+ arr[2][0]==15))
         {
             flag=true;
         }
        
        
        
        return flag;
    }
    
    //method to check if numbers repeat
    public static boolean isUnique(int[][] arr)
    {
        boolean flag=true;
        
         for(int r=0;r<arr.length;r++)
        {
           
         for(int c=0;c<arr[0].length;c++)
        {
            int num=arr[r][c];
            
         for(int secCol=c+1;secCol<arr.length;secCol++)
             
            if((num==arr[r][secCol]))
            {
                    flag=false;
            }
            
        }
            
    }
        return flag;
    }
    
    
    
    public static void main(String[] args)
    {
//        
//        System.out.println(sumRowAndCol(normalArray))  ;
//        System.out.println(isInRange(magicArray));
        
        if(isUnique(magicArray)){
            System.out.println("Array is unique!");
        }
        else
        {
        System.out.println("Array is not unique");
        
        
        
        }
        if(isMagic(magicArray))
        {
            System.out.println("The array is MAGIC!!");
        }
        else
        {
            System.out.println("The array is not magic!!");
        }
    }
    
}

