//https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchinMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=OrderagnosticBinarysearch(arr,target,0,peak);
        if(firstTry!=-1)
            return firstTry;
        return OrderagnosticBinarysearch(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end = mid;//descending part of array
            }else{
                start=mid+1;//ascending part of array
            }

        }
        return start;

    }
    static int OrderagnosticBinarysearch(int[] arr,int target,int start,int end){

        boolean ascending=arr[start]<arr[end];//if false then the arr is in descending order
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(ascending){
                if (target>arr[mid])
                    start=mid+1;
                else
                    end = mid - 1;

            } else{
                if (target<arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
