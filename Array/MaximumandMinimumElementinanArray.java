
// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/


class MaximumandMinimumElementinanArray{
    public int[] getMinMax(int arr[]){
        // Checks if array is empty or not.
        if(arr.length == 0){
            return new int[]{};
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[] {min,max};
    }
}