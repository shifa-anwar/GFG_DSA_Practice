class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
     String temp1=str1;  
    char a[]=temp1.toCharArray();
    for(int i=0;i<2;i++)
    {
    char temp=a[0];
    for(int j=0;j<a.length-1;j++)
    {
    a[j]=a[j+1];  
    }
    a[a.length-1]=temp;
    }
   String res = new String(a);
    if(res.equals(str2))
    return true;
    char b[]=str1.toCharArray();
        for(int k=0;k<2;k++)
        {
         char t=b[b.length-1];    
        for(int l=b.length-1;l>0;l--)
        {
        b[l]=b[l-1];
        }
        b[0]=t;
        }
        String re= new String(b);
        if(re.equals(str2))
        return true;
        return false;
    }
}