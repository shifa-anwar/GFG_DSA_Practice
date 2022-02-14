class NegativetoEnd {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
         int temp[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
          if(arr[i]>0)
           temp[k++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]<0)
            temp[k++]=arr[i];
        }
        for(int j=0;j<n;j++)
        {
          arr[j]=temp[j]; 
        }
    }
}