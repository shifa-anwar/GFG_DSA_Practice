class Solution {
    public int[] sortArray(int[] nums) {
    quickSort(nums,0,nums.length-1);
        return nums;
    }
    public void swap(int arr[],int i,int j)
    {  
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void quickSort(int arr[],int low,int high)
    {
     if(low<high)
     {
      int piv=partition(arr,low,high);
      quickSort(arr,low,piv-1);
      quickSort(arr,piv+1,high);  
     }
    }
    public int partition(int arr[],int low,int high)
    {
     swap(arr,low,low+(high-low)/2);
    int base = low;
     int i=low+1,j=i;
    while(i<=high)
    {
     if(arr[base]>arr[i])
     { 
      swap(arr,i,j++); 
     }
       i++; 
    }
      swap(arr,low,j-1);
        return j-1;
    }
    
}