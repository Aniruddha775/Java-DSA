package com.aniruddha.BinarySearch;

class FindDuplicates {
    public static void main(String[] args) {
    int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else
                i++;
        }
        return -1;//if no duplicates

    }
    static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;

}
}