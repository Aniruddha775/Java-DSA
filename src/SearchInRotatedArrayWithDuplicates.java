public class SearchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr={1};
        int target=0;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums,int target){
        int pivot=pivotIndex(nums);
        if(pivot==-1){
            return Binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target)
            return pivot;
        if(nums[0]<=target)
            return Binarysearch(nums,target,0,pivot-1);
        else
            return Binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int pivotIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1])
                    return start;
                start++;
                if(arr[end]<arr[end-1])
                    return end-1;
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;//means the array is not rotated
    }
    static int Binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if (target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}