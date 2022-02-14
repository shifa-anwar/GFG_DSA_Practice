class ReverseStrWords 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
     String[] arr= S.split("\\.");
     String res="";
     if(arr.length==0)
      return "";
      for(int i=arr.length-1;i>0;i--)
      {
       res+=arr[i]+".";      
      }
      res+=arr[0];
      return res;
    }
}