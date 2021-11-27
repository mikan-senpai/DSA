package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        pattern31(4);
    }
//=================================================================================================
//            *****
//            ****
//            ***
//            **
//            *
    static void pattern3(int n)
    {
        for (int rows = 1; rows <=n ; rows++) {

            for (int col = 1; col <= n-rows+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3_1(int n )
    {
        for (int i = n; i >=0 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
//=================================================================================================
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

    static void pattern4(int n )
    {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
//=================================================================================================
//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

        static void pattern5(int n )
        {
            for (int row = 0; row <2*n; row++)
            {
                int totalcol= (row>n?n-(row-n):row); //2n-row
                for (int col = 0; col < totalcol ; col++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
        

//=================================================================================================
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

    
    static void pattern28(int n)
    {
        for (int row = 0; row < 2*n; row++) 
        {
            
            int totalcol=row>n?n-(row-n):row;
            
            int spaces=n-totalcol;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcol; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }

    
//=================================================================================================

//6.          *
//           **
//          ***
//         ****
//        *****


    static void pattern6(int n)
    {
        for (int row = 0; row < n; row++) {
            int space=n-row;

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//=================================================================================================


// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5



static void pattern30(int n )
{
    for(int row=1;row<=n;row++)
    {
        int spaces=n-row;
        for(int s=0;s<=spaces;s++)
        {
            System.out.print("  ");;
        }


    for(int col=row;col>=1;col--)
    {
        System.out.print(col+" ");
    }
    for(int col=2;col<=row;col++)
    {
        System.out.print(col+ " ");
    }
    System .out.println();
    }
}
//=================================================================================================

// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1


static void pattern17(int n)
{
    for(int row=1 ; row<2*n ; row++)
    {
        int totalcol=(row>n)?(n-(row-n)):row;
        
        int space= (row<n)?n-row:row-n;

        for(int s=0 ; s<=space ; s++)
        {
            System.out.print(" ");
        }
        for(int col=totalcol ; col>=1 ; col--)
        {
            System.out.print(col);
        }
        for(int col= 2; col <=totalcol ; col++)
        {
            System.out.print(col);
        }
        System.out.println(" ");

    }
}

//=================================================================================================


// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *





//=================================================================================================
// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4   



static void pattern31(int n)
{
    int originalN= n;
    n=2*n;
    for(int row=0;row<=n;row++)
    {
        for(int col=0;col<=n;col++)
        {
            int element=originalN-Math.min(Math.min(col,n-col),Math.min(row,n-row));
            System .out.print(element+" ");
        }
    System.out.println();

    }
}




static void pattern31_kunal(int n) {
    int originalN = n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
            System.out.print(atEveryIndex + " ");
        }
        System.out.println();
    }
}



//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================
//=================================================================================================

}