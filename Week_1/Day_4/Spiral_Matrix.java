class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0, endRow = matrix.length-1;
        int startCol=0, endCol = matrix[0].length-1;
        int arr[]=new int[matrix.length*matrix[0].length];
        int k=0;
        while(startRow <= endRow && startCol <= endCol)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                arr[k++]=matrix[startRow][j];
                
            }

            for(int i=startRow+1;i<=endRow;i++)
            {
                arr[k++]=matrix[i][endCol];
                
            }

            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                arr[k++]=matrix[endRow][j];
                
            }

            for(int i=endRow-1;i>startRow;i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                arr[k++]=matrix[i][startCol];
                
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }
}
