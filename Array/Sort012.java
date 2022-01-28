class Sort012
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int b=0,c=0,d=0;
        for(int i=0;i<a.length;i++)
        {
        if(a[i]==0)
        b++;
        else if(a[i]==1)
        c++;
        else
        d++;
        }
        int j=0;
       for(int k=0;k<b;k++)
       {a[j++]=0;}
       for(int k=0;k<c;k++)
       {a[j++]=1;}
       for(int k=0;k<d;k++)
       {a[j++]=2;}
    }
}