class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        
        int rows= matrix.size();
        int cols= matrix[rows].size();
        bool rowZeros=false;


        for(int r=0;r<rows;r++)
        {
            for(int c=0; c<cols;c++)
            {
                if(matrix[r][c]==0)
                {
                    matrix[0][c]=0;
                    if(r>0)
                    {
                        matrix[r][0]=0;
                    }
                    else
                    {
                        rowZeros=true;
                    }
                }

            }
        }
        for(int r=1; r<rows; r++)
        {
            for(int c=1;c<cols;c++)
            {
                if(matrix[0][c]==0 or matrix[r][0]==0)
                {
                    matrix[r][c]=0;
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int r=0;r<rows;r++)
            {
                matrix[r][0]=0;
            }
        }
        if(rowZeros)
        {
            for(int c=0;c<cols;c++)
            {
                matrix[0][c]=0;
            }
        }
        
        
    }
};