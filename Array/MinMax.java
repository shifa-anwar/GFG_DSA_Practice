\\Find minimum and maximum element in an array 

class MinMax 
{
    static pair getMinMax(long arr[], long n)  
    {
        long min = arr[0];
        long max = arr[0];
        //Write your code here
        for(int i=0;i<n;i++)
        {
        if(arr[i]>max)
        max = arr[i];
        if(arr[i]<min)
        min = arr[i];
        }
        return new pair(min,max);
    }
}
