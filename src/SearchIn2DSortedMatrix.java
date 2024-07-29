import java.util.Arrays;

public class SearchIn2DSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    static int[] binarySearch(int[][] matrix,int row,int columnStart,int columnEnd,int target){
        while(columnStart<=columnEnd){
            int mid=columnStart+(columnEnd-columnStart)/2;
            if(target==matrix[row][mid])
                return new int[]{row,mid};
            if(target>matrix[row][mid])
                columnStart=mid+1;
            else
                columnEnd=mid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][]matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(cols==0)//matrix is empty
            return new int[]{-1,-1};
        if(rows==1)
            return binarySearch(matrix,0,0,cols-1,target);
        int rowStart=0;
        int rowEnd=rows-1;
        int colMid=cols/2;

        //Run a loop till 2 rows are remaining
        while(rowStart<(rowEnd-1)){
            int mid=rowStart+(rowEnd-rowStart)/2;
            if(matrix[mid][colMid]==target)
                return new int[]{mid,colMid};
            if(matrix[mid][colMid]<target)
                rowStart=mid;
            else
                rowEnd=mid;
        }

        //now we have 2 rows
        if(matrix[rowStart][colMid]==target)
            return new int[]{rowStart,colMid};
        if(matrix[rowStart+1][colMid]==target)
            return new int[]{rowStart,colMid};

        //otherwise consider the four cases
        if(target<=matrix[rowStart][colMid-1])
            return binarySearch(matrix,rowStart,0,colMid-1,target);
        if(target>=matrix[rowStart][colMid+1] && target<=matrix[rowStart][cols-1])
            return  binarySearch(matrix,rowStart,colMid+1,cols-1,target);
        if(target<=matrix[rowStart+1][colMid-1])
            return binarySearch(matrix,rowStart+1,0,colMid-1,target);
        else
            return binarySearch(matrix,rowStart+1,colMid+1,cols-1,target);
    }
}
