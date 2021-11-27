public class patternUsingRecursion {
    public static void main(String[] args) {
        triangle1(4,0);

    }
//    =========================================================================
//    *****
//    ****
//    ***
//    **
//    *

    static void triangle(int row, int col)
    {

        if (row==0)
        {
            return;
        }
        if (row>col)
        {
            System.out.print("*");
            triangle(row,col+1);
        }

        else {
            System.out.println();
            triangle(row-1,0);
        }
    }


//==================================================================
//*
//**
//***
//****
//*****



    static void triangle1(int row, int col)
    {

        if (row==0)
        {
            return;
        }
        if (row>col)
        {
            triangle1(row,col+1);
            System.out.print("*");

        }

        else {
            triangle1(row-1,0);
            System.out.println();

        }
    }


}
