class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(n==1)
        return arr[0];
        String res="";
        Boolean flag;
        for(int i=0;i<arr[0].length();i++)
        {
            flag= true;
            for(int j=1;j<n;j++)
            {
             if(i>=arr[j].length() || arr[0].charAt(i)!=arr[j].charAt(i))            
            {
             flag = false;    
             break;
            }
            }
            if(!flag)
            break;
            res+=arr[0].charAt(i);
        }
        if(res=="")
        return "-1";
        return res;
    }
}