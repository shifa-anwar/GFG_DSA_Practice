class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n;i++)
        {
        boolean swap = false;    
        for(int j=0;j<n-i-1;j++)
        {
        if(arr[j]>arr[j+1])
        {
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        swap = true;
        }
        }
        if(!swap)
        break;
        }
    }
    
}

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    bubbleSort(arr);
    print(arr);
  }

}