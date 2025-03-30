public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr={1,2,4,7,8,9,14,15,17,20};
        int[] arr={70,60,55,43,32,20,11,9,7,5};
        int target=100;
        System.out.println(OrderagnosticBinarysearch(arr,target));
    }
    static int OrderagnosticBinarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
